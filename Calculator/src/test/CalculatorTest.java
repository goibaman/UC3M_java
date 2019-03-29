package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import example.Calculator;

/**
 * The CalculatorTest program implements a 
 * JUnit Test Case class of the Calculator class.
 * This tests add and subtract methods.
 * 
 * @author  Java MOOC team, UC3M
 * @version 1.0
 * @since 	2016-04
 */
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
