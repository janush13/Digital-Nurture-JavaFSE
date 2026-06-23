package search;


public class SearchAlgorithm {



    // Linear Search

    public static Product linearSearch(
            Product[] products,
            int id
    ){


        for(Product p : products){


            if(p.getProductId()==id){

                return p;

            }

        }


        return null;

    }






    // Binary Search

    public static Product binarySearch(
            Product[] products,
            int id
    ){



        int low = 0;

        int high = products.length-1;



        while(low <= high){



            int mid =
                (low + high)/2;



            int midId =
                products[mid].getProductId();




            if(midId == id){

                return products[mid];

            }




            else if(id < midId){


                high = mid-1;


            }



            else{


                low = mid+1;

            }


        }


        return null;

    }


}