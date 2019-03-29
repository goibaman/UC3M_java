package src;

/**
 * Fuel Tank is the class which represents the fuel tank of a car.
 * A Fuel Tank object encapsulates the state information needed for describing the state of the tank:
 * <ul>
 *   <li> capacity  capacity of the tank
 *   <li> tankLevel	fuel level of the tank
 * </ul>
 * 
 * @invariant 		0.0 <= tankLevel <= capacity
 * 
 * @author UC3M MOOC Team
 * @since 04-2016
 *
 */
public class FuelTank {
	double capacity;
	double tankLevel;
	
	/**
	 * FuelTank: constructor of the class, it initializes its attributes 
	 * 
	 * @param capacity is the amount of fuel  (measured in liters) that the tank can hold
	 * @param tankLevel is the amount of fuel (measured in liters) that the tank will have initially
	 * 
	 * Precondition  capacity > 0.0 and 0.0 < tankLevel <= capacity  
	 * Postcondition capacity > 0.0 and 0.0 < tankLevel <= getCapacity() 
	 */
	public FuelTank(double capacity, double tankLevel){
		this.capacity      = capacity;
		this.tankLevel     = tankLevel;
	}
	
	/*
	 * empty: Status report: Is fuel tank empty?
	 */
	public boolean empty(){
		return tankLevel == 0;
	}
	
	/*
	 * full: Status report: Is fuel tank full?
	 */
	public boolean full(){
		return tankLevel == capacity;
	}
	
	/*
	 * getCurrentFuelLevel: Accessor method
	 */
	public double getTankLevel(){
		return tankLevel;
	}

	/*
	 * getCapacity: Accessor method
	 */
	public double getCapacity(){
		return capacity;
	}
	
	/**
	 * fill: Mutator to add petrol to the fuel tank
	 * 
	 * @param amount: 	amount of fuel to add
	 * 
	 * Precondition 	0.0 < amount <= getCapacity() - getTankLevel() 
	 * Postcondition 	not empty
	 * Postcondition   tankLevel > tankLevel_initial 
	 */
	public void fill(double amount){
		tankLevel = tankLevel + amount;
	}
	
	/**
	 * consumption: Mutator to consume amount of fuel
	 * @param amount: amount of fuel to consume
	 * 
	 * Precondition  0.0 < amount <= getTankLevel()
	 * Postcondition not full
	 * Postcondition tankLevel < tankLevel_initial 
	 */
	public void consumption(double amount){
		tankLevel = tankLevel - amount;
	}

}
