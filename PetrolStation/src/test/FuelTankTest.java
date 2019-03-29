package test;

/**
 * Tests for class FuelTank.
 * 
 * All tests in the folder "test" are executed 
 * when the "Test" action is invoked.
 * 
 */

import static org.junit.Assert.*;
import org.junit.Test;

import src.FuelTank;

import org.junit.Before;

public class FuelTankTest {

    FuelTank tank;
    double tanklevel;
    double capacity;
    
    @Before
    public void setup() {
        tanklevel = 0.0;
        capacity = 40.0;
        tank = new FuelTank(capacity, tanklevel);
    }
    
    @Test
    public void testGetTankLevel() {
        assertEquals(tanklevel, tank.getTankLevel(),0);
    }
    
    @Test
    public void testGetTankMax() {
        assertEquals(capacity, tank.getCapacity(),0);
    }
    
    @Test
    public void testEmpty() {
        assertTrue(tank.empty());
    }
    
  
    @Test
    public void testHalfFullTank() {
        assertFalse(tank.full());
    }
 
 }
