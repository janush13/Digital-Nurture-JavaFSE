package adapter;


public class StripeGateway {


    public void charge(double amount){


        System.out.println(
            "Stripe payment completed: Rs." + amount
        );

    }

}