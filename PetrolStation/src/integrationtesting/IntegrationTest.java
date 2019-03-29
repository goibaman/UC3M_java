package integrationtesting;

import src.Car;
import src.FuelTank;
import src.PetrolStation;

/**
 * Tests for integration
 * Class created for Testing PetrolStation (Lab2),
 * -> question 4 solution.
 * 
 */

public class IntegrationTest {

    public void testNotEnoughFuelForTravel() {

		FuelTank tank = new FuelTank(60.0, 15.0);
		Car car = new Car(tank, 0.09);
		double kms = 250.0;
        PetrolStation ps = new PetrolStation(0.9,1.1,0.1);
        double amountEuros = 100;
        double notSpendEuros = amountEuros;
        
        double missingkms = car.travel(kms);
		
		if (missingkms > 0) {
			notSpendEuros = ps.fillEuros(car,amountEuros);
		}
        
        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");
        
	}


}
