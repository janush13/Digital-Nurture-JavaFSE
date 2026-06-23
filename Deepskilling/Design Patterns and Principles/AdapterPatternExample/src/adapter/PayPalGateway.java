package adapter;


public class PayPalGateway {


    public void makePayment(double amount){


        System.out.println(
            "PayPal payment completed: Rs." + amount
        );

    }

}