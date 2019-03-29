package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * The AllTests program implements a 
 * JUnit Test Suite class of the Calculator 
 * test classes.
  * 
 * @author  Java MOOC team, UC3M
 * @version 1.0
 * @since 	2016-04
 */
@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, 
				ParameterizedSquareTest.class })
public class AllTests {

}
