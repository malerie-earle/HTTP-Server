package com.keyin.models;
import com.keyin.rest.aircraft.Aircraft;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class AircraftModelTests {
    // need to change based on contsructor
    @Test
    public void testEquals(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp",20,10, 2, 1);
        Aircraft ac2 = new Aircraft(0,"A220-300","Airbus Corp",20,10, 2, 1);
        Assertions.assertEquals(ac1, ac2);
    }
    @Test
    public void testNotEquals(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp",20,10, 2, 1);
        Aircraft ac2 = new Aircraft(0,"A220-300","Not Airbus Corp",20,10, 2, 1);
        Assertions.assertNotEquals(ac1, ac2);
    }
}
