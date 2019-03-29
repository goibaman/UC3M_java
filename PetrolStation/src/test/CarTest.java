package test;

/**
 * Tests for class Car.
 * Class created for Testing PetrolStation (Lab2),
 * -> question 3 solution.
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;

import src.Car;
import src.FuelTank;

import org.junit.Before;

public class CarTest {
    
    FuelTank tank = null;
    Car car = null;
    double consumption;

    @Before
	public void setUp() {
	    tank = new FuelTank(40.0, 20.0);
	    consumption = 0.8;
	    car = new Car(tank, consumption);
	}

    @Test
	public void testGetTank() {
		assertSame(car.getTank(), tank);
	}

	@Test
	public void testAmountKilometers() {
		assertEquals(100, car.amountKilometers(80), 0);
	}
	
	@Test
	public void testAmountFuel() {
	    assertEquals(80, car.amountFuel(100), 0);   
	}
	
	@Test
	public void testTravelIf() {
        assertEquals(45, car.travel(70), 0);
	}

    @Test
	public void testTravelElse() {
	    assertEquals(0, car.travel(10),0);
	}
}
