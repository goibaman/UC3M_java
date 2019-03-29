package Teste2;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.Calculator;

public class CalculatorTest {
    
    Calculator calc = null;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        calc.add(2);
        assertEquals(2,calc.getResult(),0);
    }

    @Test
    public void testSubtract() {
        calc.subtract(1);
        assertTrue(calc.getResult()==1);
    }

}