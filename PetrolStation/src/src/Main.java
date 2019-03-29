package src;

import integrationtesting.IntegrationTest;
import structuraltest.PetrolStationTest;

/**
 * Main class allows to run manual tests through standard output
 * 
 * @author UC3M MOOC Team
 * @since 04-2016
 */
public class Main {
	
    public static void main(String[] args) {
        
        System.out.println("************Testing question 2***************");
        PetrolStationTest pst = new PetrolStationTest();
        pst.enterOnceForIfFillEuros();
        pst.enterOnceForElseFillEuros();
   
        
        System.out.println("************Testing question 4***************");
		IntegrationTest intest = new IntegrationTest();
		intest.testNotEnoughFuelForTravel();
	}
}
