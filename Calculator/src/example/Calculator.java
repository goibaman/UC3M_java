package example;

/**
 * The Calculator program implements an application
 * that models a calculator with operations such as:
 * add, subtract and square.
 * 
 * @author  Java MOOC team, UC3M
 * @version 1.0
 * @since 	2016-04
 */

public class Calculator {

	 private static int result;
		
	 public void add(int n){
	 	result += n;
	 }
		
	 public void subtract(int n){
		result -= n;
	 }
		
	 public void square(int n){
		result = n*n;
	 }

	 public int getResult(){
		return result;
	 }

}
