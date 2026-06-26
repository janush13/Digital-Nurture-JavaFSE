import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class AAATest {


    Calculator calculator;



    @Before
    public void setUp()
    {
        System.out.println("Setup completed");

        calculator = new Calculator();
    }



    @After
    public void tearDown()
    {
        System.out.println("Cleanup completed");
    }





    @Test
    public void testAddition()
    {


        // Arrange
        int a = 10;
        int b = 20;



        // Act
        int result = calculator.add(a,b);



        // Assert
        assertEquals(30,result);

    }






    @Test
    public void testMultiplication()
    {


        // Arrange
        int x = 5;
        int y = 4;



        // Act
        int result = calculator.multiply(x,y);



        // Assert
        assertEquals(20,result);

    }


}