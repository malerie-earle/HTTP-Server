package com.keyin.rest.passenger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class PassengerController {
    @Autowired
    private PassengerService passengerService = new PassengerService();


    @PostMapping("passenger")
    public Passenger createPassenger (@RequestBody Passenger newPassenger){
        return passengerService.createPassenger(newPassenger);
    }

    @GetMapping("passengers")
    public List<Passenger> getAllPassengers(){
        return passengerService.getAllPassengers();
    }

    @GetMapping("passenger/{id}")
    public Passenger getPassenger(@PathVariable Long id){
        return passengerService.getPassenger(id);
    }

    @GetMapping("search_passenger")
    public List<Passenger> findPassengerByName(@RequestParam(value = "first-name", required = false) String firstName, @RequestParam(value = "last-name", required = false) String lastName){
        return passengerService.findPassengerByName(firstName, lastName);
    }

    @PutMapping ("passenger/{id}")
    public Passenger updatePassenger(@PathVariable Long id, @RequestBody Passenger updatedPassenger){
        return passengerService.updatePassenger(id, updatedPassenger);
    }

    @DeleteMapping ("passenger/{id}")
    public void deletePassenger(@PathVariable Long id){
        passengerService.deletePassenger(id);
    }

}