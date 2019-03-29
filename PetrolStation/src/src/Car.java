package src;

/**
 * Car class models a car with a
 * fuel tank and its consumption
 * 
 * @author UC3M MOOC Team
 * @since 04-2016
 */
public class Car {
	
	FuelTank tank;
	double   consumption;
	
	/*
	 * Car is the Constructor
	 * Precondition   tank != null
	 * Precondition   consumption > 0.0
	 */
	public Car(FuelTank tank, double consumption){
		this.tank 		 = tank;
		this.consumption = consumption;
	}
	
	/*
	 * getTank Access to the car's fuel-tank
	 */
	public FuelTank getTank(){
		return tank;
	}
	
	/*
	 * amountKilometers indicates the amount of kilometers that the car can travel
	 * with "amountFuel" fuel
	 * 
	 * Precondition  amountFuel >= 0 
	 * Postcondition returnValue >= 0
	 */
	public double amountKilometers(double amountFuel){
		return amountFuel / consumption;
	}
	
	/*
	 * amountFuel indicates the amount of fuel that the car needs to travel "kilometers" kilometers
	 * 
	 * Precondition  amountKilometers >= 0 
	 * Postcondition returnValue >= 0
	 */
	public double amountFuel(double kilometers){
		return kilometers * consumption;
	}
	
	
	/*
	 * travel receives the number of kilometers that the customer intends to travel
	 * returns the number of kilometers that could not be traveled
	 * 
	 * @param kilometers: intended distance to travel
	 * @return return_value = 0 if there were enough fuel to travel "kilometers" kilometers, otherwise, return_value > 0.0
	 * 
	 * Precondition  kilometers > 0.0
	 * Postcondition kilometers_after < kilometers_before
	 */
	public double travel(double kilometers){
		double amountFuelNecessary 	= amountFuel(kilometers);	
		double amountFuelAvailable 	= tank.getTankLevel();
		
		if (amountFuelNecessary > amountFuelAvailable){ 
			tank.consumption(amountFuelAvailable);
			return amountKilometers(amountFuelNecessary - amountFuelAvailable);
		} else{ 										
			tank.consumption(amountFuelNecessary);
			return 0.0;
		}
	}	
}
