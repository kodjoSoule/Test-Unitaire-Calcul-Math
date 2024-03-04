package com.app;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class CalculMathTest {

    private CalculMath calculMath;

    @Before
    public void setUp() {
        calculMath = new CalculMath();
    }

    @Test
    public void testSomme() {
    		
        assertEquals(-1, calculMath.somme(-2, 1)) ;
    }

    @Test
    public void testDifference() {
        assertEquals(3, calculMath.difference(5, 2));
        assertEquals(-4, calculMath.difference(1, 5));
    }
    

    @Test
    public void testQuotient() {
//    	Given
    	int a = 1;
    	int b = 2;
    	double result ;
//    	When
    	int expect =  2 ;
    	result = calculMath.quotient(a, b);
//    	
//        Then
    	assertEquals(expect,result);
        assertEquals(-3.0, calculMath.quotient(-9, 3), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testQuotientDivisionParZero() {
        calculMath.quotient(5, 0);
    }
}
