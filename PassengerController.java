package com.keyin.rest.passenger;

import com.keyin.rest.passenger.Passenger;
import com.keyin.rest.passenger.PassengerService;
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
        return passengerService.createNewPassenger(newPassenger);
    }

    @GetMapping("passengers")
    public List<Passenger> getAllPassengers(){
        return passengerService.getAllPassengers();
    }

    @GetMapping("passenger/{id}")
    public Passenger getPassenger(@PathVariable Integer id){
        return passengerService.getPassengerByID(id);
    }

    @PutMapping("passenger/{id}")
    public Passenger updatePassenger(@PathVariable Integer id, @RequestBody Passenger updatedPassenger){
        return passengerService.updatePassengerByID(id, updatedPassenger);
    }

    @DeleteMapping("passenger/{id}")
    public Passenger deletePassenger(@PathVariable Integer id){
        return passengerService.deletePassenger(id);
    }

}
