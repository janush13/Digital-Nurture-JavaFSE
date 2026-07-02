package com.library.controller;


import java.util.List;


import org.springframework.web.bind.annotation.*;


import com.library.entity.Book;
import com.library.repository.BookRepository;



@RestController
@RequestMapping("/books")
public class BookController {


    private final BookRepository repository;


    public BookController(BookRepository repository) {

        this.repository = repository;

    }



    @GetMapping
    public List<Book> getBooks() {

        return repository.findAll();

    }



    @PostMapping
    public Book addBook(@RequestBody Book book) {

        return repository.save(book);

    }



    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable Long id,
            @RequestBody Book book) {


        Book oldBook = repository.findById(id).get();


        oldBook.setTitle(book.getTitle());

        oldBook.setAuthor(book.getAuthor());


        return repository.save(oldBook);

    }



    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {

        repository.deleteById(id);

        return "Book deleted successfully";

    }

}