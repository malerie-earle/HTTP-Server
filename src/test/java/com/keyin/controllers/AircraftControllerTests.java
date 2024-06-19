package com.keyin.controllers;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.aircraft.AircraftController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AircraftControllerTests {

    private AircraftController aircraftController = new AircraftController();

    // Testing the ability to create aircraft. Note that other tests will fail if this one fails.
    @Test
    public void testCreateAircraft(){
        // the aircraft to add
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp","Air Canada",132);
        // add it to the list in the controller
        aircraftController.createAircraft(ac1);
        // We see if the size of the list/map in the controller changed
        Assertions.assertEquals(aircraftController.getAllAircrafts().size(), 1);
    }

    // Testing the ability to get all aircraft
    @Test
    public void testGetAllAircraft(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","West Jet",132);
        Aircraft ac3 = new Aircraft(2,"A220-300","Airbus Corp","PAL Airlines",132);
        // We setup the Controller with some aircraft
        aircraftController.createAircraft(ac1);
        aircraftController.createAircraft(ac2);
        aircraftController.createAircraft(ac3);
        // the actual list of the aircraft at this moment of time
        List<Aircraft> acList = aircraftController.getAllAircrafts();
        // The below might require an override of the equals method for aircraft
        // We compare to see if the actual list has the elements of the expected list
        Assertions.assertEquals(acList.get(0),ac1);
        Assertions.assertEquals(acList.get(1),ac2);
        Assertions.assertEquals(acList.get(2),ac3);

    }

    // Testing the ability to get aircraft by id
    @Test
    public void testGetAircraftByID(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","West Jet",132);
        Aircraft ac3 = new Aircraft(2,"A220-300","Airbus Corp","PAL Airlines",132);
        // We setup the Controller with some aircraft
        aircraftController.createAircraft(ac1);
        aircraftController.createAircraft(ac2);
        aircraftController.createAircraft(ac3);

        // The expected aircraft
        Aircraft eac = new Aircraft(1,"A220-300","Airbus Corp","West Jet",132);
        // The below might require an override of the equals method for aircraft
        // We compare the get from the controller to the desired aircraft
        Assertions.assertEquals(aircraftController.getAircraft(1), eac);
    }

    // Testing the ability to update aircraft by id
    @Test
    public void testUpdateAircraft(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","West Jet",132);
        Aircraft ac3 = new Aircraft(2,"A220-300","Airbus Corp","PAL Airlines",132);
        // We setup the Controller with some aircraft
        aircraftController.createAircraft(ac1);
        aircraftController.createAircraft(ac2);
        aircraftController.createAircraft(ac3);
        // We create the updated aircraft
        Aircraft toBeUpdated = new Aircraft(1,"A220-300","Airbus Corp","Scott's Airline",132);
        // We invoke the update method
        aircraftController.updateAircaft(1,toBeUpdated);
        // The expected aircraft
        Aircraft eac = new Aircraft(1,"A220-300","Airbus Corp","Scott's Airline",132);
        // The below might require an override of the equals method for aircraft
        // We check if the expected aircraft is equal to the actual aircraft
        Assertions.assertEquals(aircraftController.getAircraft(1), eac);
    }

    // Testing the ability to delete aircraft by id
    @Test
    public void testDeleteAircraft(){
        Aircraft ac1 = new Aircraft(0,"A220-300","Airbus Corp","Air Canada",132);
        Aircraft ac2 = new Aircraft(1,"A220-300","Airbus Corp","West Jet",132);
        Aircraft ac3 = new Aircraft(2,"A220-300","Airbus Corp","PAL Airlines",132);
        // We setup the Controller with some aircraft
        aircraftController.createAircraft(ac1);
        aircraftController.createAircraft(ac2);
        aircraftController.createAircraft(ac3);
        // We invoke the delete method
        aircraftController.deleteAircraft(1);
        // We check if the aircraft is not in the map
        Assertions.assertFalse(aircraftController.getAllAircrafts().contains(ac2));
    }

}
