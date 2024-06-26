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

    @GetMapping("flights/destination/{id}")
    public List<Flight> getDestinationFlightsByAirportID(@PathVariable Long id){
        List<Flight> allFlights = flightService.getAllFlight();
        return allFlights.stream().filter(fl -> fl.getDestination().getAirport_ID() == id).toList();
    }

    @GetMapping("flights/origin/{id}")
    public List<Flight> getOriginFlightsByAirportID(@PathVariable Long id){
        List<Flight> allFlights = flightService.getAllFlight();
        return allFlights.stream().filter(ap -> ap.getOrigin().getAirport_ID() == id).toList();
    }

    @GetMapping("flights/airport/{id}")
    public List<Flight> getFlightsByAirportID(@PathVariable Long id){
        List<Flight> allFlights = flightService.getAllFlight();
        return allFlights.stream().filter(ap -> (ap.getOrigin().getAirport_ID() == id || ap.getDestination().getAirport_ID() == id )).toList();
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

    @PutMapping("flight/book/update/{id}")
    public Booking updateBooking(@PathVariable Long id, @RequestBody Booking booking){
        Flight targetFlight = flightService.getFlightByID(id);
        if(targetFlight != null && !targetFlight.isOccupied(booking.getSeatRow(), booking.getSeatColumn())){
            Booking oldBooking = bookingService.getBookingByID(id);
            Booking updatedBooking = bookingService.updateBookingByID(id, booking);
            targetFlight.setSeat(oldBooking.getSeatRow(), oldBooking.getSeatColumn(), null);
            targetFlight.setSeat(booking.getSeatRow(), booking.getSeatColumn(), updatedBooking);
            return updatedBooking;
        }else{
            return null;
        }
    }

    @DeleteMapping ("flight/book/delete/{id}")
    public Booking deleteBookingByID(@PathVariable Long id){
        Flight targetFlight = flightService.getFlightByID(id);
        if(targetFlight != null){
            Booking deletedBooking = bookingService.deleteBooking(id);
            targetFlight.setSeat(deletedBooking.getSeatRow(), deletedBooking.getSeatColumn(), null);
            return deletedBooking;
        }else{
            return null;
        }
    }

    @GetMapping("bookings")
    public List<Booking> getAllBookings(){
        return bookingService.getAllBooking();
    }

    @GetMapping("booking/{id}")
    public Booking getBookingbyBookingID(@PathVariable Long id){
        return bookingService.getBookingByID(id);
    }

    @GetMapping("bookings/passenger/{id}")
    public List<Booking> getBookingsByPassengerID(@PathVariable Long id){
        List<Booking> allBookings = bookingService.getAllBooking();
        return allBookings.stream().filter(b -> b.getPassenger_ID() == id).toList();
    }

    //unsure if needed
    @GetMapping("bookings/flight/{id}")
    public List<Booking> getBookingsByFlightID(@PathVariable Long id){
        List<Booking> allBookings = bookingService.getAllBooking();
        return allBookings.stream().filter(b -> b.getFlight_ID() == id).toList();
    }


}
