package com.keyin.models;

import com.keyin.rest.flight.Flight;
import com.keyin.rest.flight.FlightController;
import com.keyin.rest.flight.Flight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FlightModelTests {
    private FlightController flightController = new FlightController();

    // Testing the ability to create flight. Note that other tests will fail if this one fails.
    @Test
    public void testCreateFlight(){
        // We create an flight
        flightController.createFlight();
        // We see if the size changed
        Assertions.assertEquals(flightController.flightService.flightMap.size(), 1);
    }

    // Testing the ability to get all flight
    @Test
    public void testGetAllFlight(){
        // We setup the Controller with some flight
        flightController.createFlight();
        flightController.createFlight();
        flightController.createFlight();

        Flight f1 = new Flight();
        Flight f2 = new Flight();
        Flight f3 = new Flight();
        // will need to change depending on data structure
        Map<Integer, Flight> eflightMap = new HashMap<>();
        eflightMap.put(0,f1);
        eflightMap.put(1,f2);
        eflightMap.put(2,f3);
        // The below might require an override of the equals method for flight
        // We compare to see if the expected map is equal to the actual map
        Assertions.assertEquals(eflightMap, flightController.flightService.flightMap);
    }

    // Testing the ability to get flight by id
    @Test
    public void testGetFlightByID(){
        // We setup the Controller with some flight
        flightController.createFlight();
        flightController.createFlight();
        flightController.createFlight();

        // The expected flight
        Flight ef = new Flight();
        // The below might require an override of the equals method for flight
        // We compare the get from the controller to the desired flight
        Assertions.assertEquals(flightController.getFlightByID(1), ef);
    }

    // Testing the ability to update flight by id
    @Test
    public void testUpdateFlight(){
        // We setup the Controller with some flight
        flightController.createFlight();
        flightController.createFlight();
        flightController.createFlight();
        // We invoke the update method
        flightController.updateFlightByID();
        // The expected flight
        Flight ef = new Flight();
        // The below might require an override of the equals method for flight
        // We check if the expected flight is equal to the actual flight
        Assertions.assertEquals(flightController.flightController.flightService.flightMap.get(1), ef);
    }

    // Testing the ability to delete flight by id
    @Test
    public void testDeleteFlight(){
        // We setup the Controller with some flight
        flightController.createFlight();
        flightController.createFlight();
        flightController.createFlight();
        // We invoke the delete method
        flightController.deleteFlightByID(1);
        // We check if the flight is not in the map
        Assertions.assertFalse(flightController.flightController.flightService.flightMap.containsKey(1));
    }
}
