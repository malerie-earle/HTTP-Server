package com.keyin.rest.aircraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AircraftController {
    @Autowired
    private AircraftService aircraftService = new AircraftService();

    @PostMapping("aircraft")
    public Aircraft createAircraft (@RequestBody Aircraft newAircraft){
        return aircraftService.createNewAircraft(newAircraft);
    }

    @GetMapping("aircrafts")
    public List<Aircraft> getAllAircrafts(){
        return aircraftService.getAllAircraft();
    }

    @GetMapping("aircraft/{id}")
    public Aircraft getAircraft(@PathVariable Integer id){
        return aircraftService.getAircraftByID(id);
    }

    @GetMapping("search_aircraft")
    public List<Aircraft> findAircraftByAirline(@RequestParam(value = "airline", required = false) String airline){
        return aircraftService.findAircraftByAirline(airline);
    }

    @PutMapping("aircraft/{id}")
    public Aircraft updateAircaft(@PathVariable Integer id, @RequestBody Aircraft updatedAircraft){
        return aircraftService.updateAircraftByID(id, updatedAircraft);
    }

    @DeleteMapping("aircraft/{id}")
    public Aircraft deleteAircraft(@PathVariable Integer id){
        return aircraftService.deleteAircraft(id);
    }

}
