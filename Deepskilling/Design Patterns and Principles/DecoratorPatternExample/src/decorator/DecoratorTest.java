package decorator;


public class DecoratorTest {


    public static void main(String[] args){


        Notifier notifier =
                new EmailNotifier();



        notifier.send(
            "Welcome User"
        );



        System.out.println();



        Notifier smsNotifier =
                new SMSNotifierDecorator(
                    notifier
                );


        smsNotifier.send(
            "OTP Generated"
        );



        System.out.println();



        Notifier allNotifier =
                new SlackNotifierDecorator(
                    new SMSNotifierDecorator(
                        new EmailNotifier()
                    )
                );



        allNotifier.send(
            "Payment Successful"
        );

    }

}