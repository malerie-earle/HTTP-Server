package com.keyin.rest.flight;

import com.keyin.rest.aircraft.Aircraft;
import com.keyin.rest.airport.Airport;
import com.keyin.rest.booking.Booking;
import com.keyin.rest.booking.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
public class FlightController {
    @Autowired
    private FlightService flightService = new FlightService();
    private BookingService bookingService = new BookingService();

    @PostMapping("flight")
    public Flight createFlight (@RequestBody Flight newFlight){
        newFlight.setBookings(new Booking[newFlight.getAircraft().getRows()][newFlight.getAircraft().getColumns()]);
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

    @GetMapping("flights/arriving/{id}")
    public List<Flight> getArrivingFlightsByAirportID(@PathVariable Long id){
        List<Flight> allFlights = flightService.getAllFlight();
        return allFlights.stream().filter(fl -> fl.getDestination().getAirport_ID() == id).toList();
    }

    @GetMapping("flights/departing/{id}")
    public List<Flight> getDepartingFlightsByAirportID(@PathVariable Long id){
        List<Flight> allFlights = flightService.getAllFlight();
        return allFlights.stream().filter(ap -> ap.getOrigin().getAirport_ID() == id).toList();
    }

    @GetMapping("flights/airline/{airline}")
    public List<Flight> getFlightByAirLine(@PathVariable String airline){
        List<Flight> allFlights = flightService.getAllFlight();
        String decodedAirline = URLDecoder.decode(airline);
        return allFlights.stream().filter(fl -> fl.getAircraft().getAirline().equals(decodedAirline)).toList();
    }

    @PostMapping("flight/book")
    public Booking bookFlightByID(@RequestBody Booking booking){
        Flight targetFlight = flightService.getFlightByID(booking.getFlight_ID());
        if(!targetFlight.isOccupied(booking.getSeatRow(), booking.getSeatColumn())){
            Booking newBooking = bookingService.createNewBooking(booking);
            targetFlight.setSeat(newBooking.getSeatRow(), newBooking.getSeatColumn(), booking);
            return newBooking;
        }else {
            return null;
        }
    }

    @GetMapping("bookings")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBooking();
    }

    @GetMapping("booking/{id}")
    public Booking getBookingbyBookingID(@PathVariable Integer id){
        return bookingService.getBookingByID(id);
    }

    @GetMapping("bookings/passenger/{id}")
    public List<Booking> getBookingsByPassengerID(@PathVariable Integer id){
        List<Booking> allBookings = bookingService.getAllBooking();
        return allBookings.stream().filter(b -> b.getPassenger_ID() == id).toList();
    }

    @GetMapping("bookings/flight/{id}")
    public List<Booking> getBookingsByFlightID(@PathVariable Integer id){
        List<Booking> allBookings = bookingService.getAllBooking();
        return allBookings.stream().filter(b -> b.getFlight_ID() == id).toList();
    }
    
}
