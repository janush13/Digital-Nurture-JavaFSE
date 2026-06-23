package builder;



public class BuilderTest {


    public static void main(String[] args){



        Computer computer1 =
                new Computer.Builder()

                .setCPU("Intel i7")

                .setRAM("16GB")

                .setStorage("512GB SSD")

                .setGPU("RTX 4060")

                .setOS("Windows 11")

                .build();



        System.out.println("Computer 1 Details:");

        computer1.showDetails();





        System.out.println();




        Computer computer2 =
                new Computer.Builder()

                .setCPU("AMD Ryzen 7")

                .setRAM("32GB")

                .setStorage("1TB SSD")

                .setGPU("RTX 4070")

                .setOS("Linux")

                .build();




        System.out.println("Computer 2 Details:");

        computer2.showDetails();


    }

}