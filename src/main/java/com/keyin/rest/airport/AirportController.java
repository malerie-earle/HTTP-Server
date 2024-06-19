package com.keyin.rest.airport;

import com.keyin.rest.airport.Airport;
import com.keyin.rest.airport.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AirportController {
    @Autowired
    private AirportService airportService;


    @PostMapping("airport")
    public Airport createAirport (@RequestBody Airport newAirport){
        return airportService.createAirport(newAirport);
    }

    @GetMapping("airports")
    public List<Airport> getAllAirports(){
        return airportService.getAllAirports();
    }

}
