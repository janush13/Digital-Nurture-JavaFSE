import org.junit.Test;
import static org.junit.Assert.*;


public class BankAccountTest {



    @Test
    public void testDeposit()
    {

        BankAccount account = new BankAccount(1000);


        account.deposit(500);


        assertEquals(1500,
                     account.getBalance(),
                     0);

    }





    @Test
    public void testWithdraw()
    {

        BankAccount account = new BankAccount(1000);


        account.withdraw(300);


        assertEquals(700,
                     account.getBalance(),
                     0);

    }





    @Test
    public void testInsufficientBalance()
    {

        BankAccount account = new BankAccount(500);


        account.withdraw(1000);


        assertEquals(500,
                     account.getBalance(),
                     0);

    }

}