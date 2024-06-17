package com.keyin.controllers;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.aircraft.AircraftController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

public class AircraftControllerTests {

    private AircraftController aircraftController = new AircraftController();

    // Testing the ability to create aircraft. Note that other tests will fail if this one fails.
    @Test
    public void testCreateAircraft(){
        // We create an aircraft
        aircraftController.createAircraft("Airbus A220-300","Air Canada",132);
        // We see if the size changed
        Assertions.assertEquals(aircraftController.aircraftService.aircraftMap.size(), 1);
    }

    // Testing the ability to get all aircraft
    @Test
    public void testGetAllAircraft(){
        // We setup the Controller with some aircraft
        aircraftController.createAircraft("Airbus A220-300","Air Canada",132);
        aircraftController.createAircraft("Airbus A220-300","West Jet",132);
        aircraftController.createAircraft("Airbus A220-300","Pal Airlines",132);

        Aircraft ac1 = new Aircraft(0,"Airbus A220-300","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"Airbus A220-300","West Jet",132);
        Aircraft ac3 = new Aircraft(2,"Airbus A220-300","Pal Airlines",132);
        // will need to change depending on data structure
        Map <Integer, Aircraft> eaircraftMap = new HashMap<>();
        eaircraftMap.put(0,ac1);
        eaircraftMap.put(1,ac2);
        eaircraftMap.put(2,ac3);
        // The below might require an override of the equals method for aircraft
        // We compare to see if the expected map is equal to the actual map
        Assertions.assertEquals(eaircraftMap, aircraftController.aircraftService.aircraftMap);
    }

    // Testing the ability to get aircraft by id
    @Test
    public void testGetAircraftByID(){
        // We setup the Controller with some aircraft
        aircraftController.createAircraft("Airbus A220-300","Air Canada",132);
        aircraftController.createAircraft("Airbus A220-300","West Jet",132);
        aircraftController.createAircraft("Airbus A220-300","Pal Airlines",132);

        // The expected aircraft
        Aircraft eac = new Aircraft(1,"Airbus A220-300","West Jet",132);
        // The below might require an override of the equals method for aircraft
        // We compare the get from the controller to the desired aircraft
        Assertions.assertEquals(aircraftController.getAircraftByID(1), eac);
    }

    // Testing the ability to update aircraft by id
    @Test
    public void testUpdateAircraft(){
        // We setup the Controller with some aircraft
        aircraftController.createAircraft("Airbus A220-300","Air Canada",132);
        aircraftController.createAircraft("Airbus A220-300","West Jet",132);
        aircraftController.createAircraft("Airbus A220-300","Pal Airlines",132);
        // We invoke the update method
        aircraftController.updateAircraftByID(1,"Airbus A220-300","Scott's Airline",132);
        // The expected aircraft
        Aircraft eac = new Aircraft(1,"Airbus A220-300","Scott's Airline",132);
        // The below might require an override of the equals method for aircraft
        // We check if the expected aircraft is equal to the actual aircraft
        Assertions.assertEquals(aircraftController.aircraftController.aircraftService.aircraftMap.get(1), eac);
    }

    // Testing the ability to delete aircraft by id
    @Test
    public void testDeleteAircraft(){
        // We setup the Controller with some aircraft
        aircraftController.createAircraft("Airbus A220-300","Air Canada",132);
        aircraftController.createAircraft("Airbus A220-300","West Jet",132);
        aircraftController.createAircraft("Airbus A220-300","Pal Airlines",132);
        // We invoke the delete method
        aircraftController.deleteAircraftByID(1);
        // We check if the aircraft is not in the map
        Assertions.assertFalse(aircraftController.aircraftController.aircraftService.aircraftMap.containsKey(1));
    }

}
