package com.keyin.rest.airport;

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

    @GetMapping("search_airport")
    public List<Airport> findAirportByProvinceOrName(@RequestParam(value = "province", required = false) String province, @RequestParam(value = "name", required = false) String name){
        return airportService.findAirportByProvinceOrName(province, name);
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
