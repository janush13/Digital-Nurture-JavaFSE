package adapter;


public class AdapterTest {


    public static void main(String[] args){



        PaymentProcessor paypal =
            new PayPalAdapter(
                new PayPalGateway()
            );



        paypal.processPayment(2500);




        PaymentProcessor stripe =
            new StripeAdapter(
                new StripeGateway()
            );



        stripe.processPayment(5000);


    }

}