package search;



public class SearchTest {


    public static void main(String[] args){



        Product[] products =
        {

            new Product(
                101,
                "Laptop",
                "Electronics"
            ),

            new Product(
                105,
                "Mobile",
                "Electronics"
            ),

            new Product(
                110,
                "Headphone",
                "Accessories"
            ),

            new Product(
                120,
                "Keyboard",
                "Accessories"
            )

        };




        System.out.println(
            "Linear Search:"
        );


        Product result1 =
            SearchAlgorithm.linearSearch(
                products,
                110
            );


        result1.display();





        System.out.println(
            "\nBinary Search:"
        );



        Product result2 =
            SearchAlgorithm.binarySearch(
                products,
                120
            );


        result2.display();



    }

}