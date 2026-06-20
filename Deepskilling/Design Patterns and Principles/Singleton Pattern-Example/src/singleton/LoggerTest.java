package singleton;

public class LoggerTest {


    public static void main(String[] args) {


        // Creating first reference
        Logger logger1 = Logger.getInstance();


        // Creating second reference
        Logger logger2 = Logger.getInstance();



        // Using logger
        logger1.log("Application Started");


        logger2.log("User Logged In");



        // Checking whether both objects are same

        if(logger1 == logger2) {


            System.out.println(
                "Both logger objects are the same"
            );


        } else {


            System.out.println(
                "Different logger objects"
            );

        }

    }

}