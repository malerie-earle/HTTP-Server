package com.keyin.rest.booking;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

@Service
public class BookingService {
    private Map<Long, Booking> bookingMap = new HashMap<Long, Booking>();

    public Booking createNewBooking(Booking newBooking){
        newBooking.setBooking_ID(bookingMap.size());
        bookingMap.put((long) bookingMap.size(), newBooking);
        return newBooking;
    }

    public Booking getBookingByID(Long id){
        return bookingMap.get(id);
    }

    public Booking updateBookingByID(Long id, Booking updatedBooking){
        if(bookingMap.get(id) != null){
            updatedBooking.setBooking_ID(id);
            bookingMap.put(id,updatedBooking);
            return updatedBooking;
        }
        return null;
    }

    public Booking deleteBooking(Long id){
        return bookingMap.remove(id);
    }

    public List<Booking> getAllBooking(){
        return List.copyOf(bookingMap.values());
    }

}
