package com.keyin.rest.passenger;

import com.keyin.rest.passenger.Passenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerService {

    private Map<Integer, Passenger> passengerMap = new HashMap<Integer, Passenger>();

    public Passenger createNewPassenger(Passenger newPassenger){
        newPassenger.setPassenger_ID(passengerMap.size());
        passengerMap.put(passengerMap.size(), newPassenger);
        return newPassenger;
    }

    public Passenger getPassengerByID(Integer id){
        return passengerMap.get(id);
    }

    public Passenger updatePassengerByID(Integer id, Passenger updatedPassenger){
        if(passengerMap.get(id) != null){
            updatedPassenger.setPassenger_ID(id);
            passengerMap.put(id,updatedPassenger);
            return updatedPassenger;
        }
        return null;
    }

    public Passenger deletePassenger(Integer id){
        return passengerMap.remove(id);
    }

    public List<Passenger> getAllPassengers(){
        return List.copyOf(passengerMap.values());
    }
}

