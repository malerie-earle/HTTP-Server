package com.keyin.rest.flight;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.airport.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin
public class FlightController {
    @Autowired
    private FlightService flightService = new FlightService();

    @PostMapping("flight")
    public Flight createFlight (@RequestBody long flight_ID, Airport departure, Airport arrival, Aircraft aircraft, LocalDateTime departure_time, LocalDateTime arrival_time, Flight.Status status){
        Flight newFlight = new Flight(flight_ID, departure, arrival, aircraft, departure_time, arrival_time, status);
        //newFlight.setBookings(new Bookings[aircraft.getRows()][aircraft.getCols()]);
        return flightService.createNewFlight(newFlight);
    }

    @GetMapping("flights")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlight();
    }

    @GetMapping("flight/{id}")
    public Flight getFlight(@PathVariable Long id){
        return flightService.getFlightByID(id);
    }

    @PutMapping("flight/{id}")
    public Flight updateAircaft(@PathVariable Long id, @RequestBody Flight updatedFlight){
        return flightService.updateFlightByID(id, updatedFlight);
    }

    @DeleteMapping("flight/{id}")
    public Flight deleteFlight(@PathVariable Long id){
        return flightService.deleteFlight(id);
    }

}
