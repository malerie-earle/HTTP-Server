package com.keyin.rest.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FlightController {
    @Autowired
    private FlightService flightService = new FlightService();

    @PostMapping("flight")
    public Flight createFlight (@RequestBody Flight newFlight){
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
