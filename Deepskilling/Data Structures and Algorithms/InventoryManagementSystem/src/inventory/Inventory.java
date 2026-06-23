package inventory;


import java.util.HashMap;


public class Inventory {


    private HashMap<Integer, Product> products;



    public Inventory(){

        products = new HashMap<>();

    }




    // Add product

    public void addProduct(Product product){


        products.put(
            product.getProductId(),
            product
        );


        System.out.println(
            "Product added"
        );

    }






    // Update product quantity

    public void updateProduct(
            int productId,
            int quantity
    ){


        Product product =
                products.get(productId);



        if(product != null){


            product.setQuantity(quantity);


            System.out.println(
                "Product updated"
            );


        }
        else{


            System.out.println(
                "Product not found"
            );

        }


    }







    // Delete product

    public void deleteProduct(int productId){


        if(products.remove(productId)!=null){


            System.out.println(
                "Product deleted"
            );


        }
        else{


            System.out.println(
                "Product not found"
            );

        }

    }






    // Display all products

    public void displayProducts(){


        for(Product product :
                products.values()){


            product.displayProduct();

        }

    }


}