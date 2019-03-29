package structuraltest;

import src.Car;
import src.FuelTank;
import src.PetrolStation;

/**
 * Tests for class PetrolStation
 * Class created for Testing PetrolStation (Lab2),
 * -> question 2 solution.
 * 
 */

public class PetrolStationTest {
    
    PetrolStation ps = null;
    double amountEuros;
    
    public PetrolStationTest() {
        ps = new PetrolStation(1,1.5,0.1);
        amountEuros = 20.0;
    }
    
    public void enterOnceForIfFillEuros() {
        FuelTank tank1 = new FuelTank(40.0,39.9);
        Car car1 = new Car(tank1, 0.9);
        double notSpendEuros = ps.fillEuros(car1,amountEuros);
        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");
        
    }
    
    public void enterOnceForElseFillEuros() {
        FuelTank tank2 = new FuelTank(60.0,60.0);
        Car car2 = new Car(tank2, 0.9);
        double notSpendEuros = ps.fillEuros(car2,amountEuros);
        System.out.println("The client spends " + (amountEuros - notSpendEuros) + " euros.");
        
    }
    
}