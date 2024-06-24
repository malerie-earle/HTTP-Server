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

    @GetMapping("airport/{id}")
    public Airport getAirport(@PathVariable Integer id){
        return airportService.getAirport(id);
    }

    @PutMapping ("airport/{id}")
    public Airport updateAirport(@PathVariable Integer id, @RequestBody Airport updatedAirport){
        return airportService.updateAirport(id, updatedAirport);
    }

    @DeleteMapping ("airport/{id}")
    public void deleteAirport(@PathVariable Integer id){
        airportService.deleteAirport(id);
    }

}
