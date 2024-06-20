//package com.keyin.rest.aircraft;
//
//import com.keyin.rest.*;
//import com.keyin.rest.airport.Airport;
//import com.keyin.rest.flight.Flight;
//
//public class Booking {
//    private String bookingID;
//    private Flight flight;
//
//    public Booking(String bookingID, Flight flight) {
//        this.bookingID = bookingID;
//        this.flight = flight;
//    }
//
//    public String getBookingID() {
//        return bookingID;
//    }
//
//    public void setBookingID(String bookingID) {
//        this.bookingID = bookingID;
//    }
//
//    public Flight getFlight() {
//        return flight;
//    }
//
//    public void setFlight(Flight flight) {
//        this.flight = flight;
//    }
//
//    public boolean chooseSeat(int row, int col) {
//        if (row < flight.getAircraft().getRows() && col < flight.getAircraft().getColumns() && !flight.seatOccupied[row][col]) {
//            flight.occupySeat(row, col);
//            return true;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Aircraft aircraft = new Aircraft(1, "Boeing 737", "Airline X", 150, 30, 6, 1);
//        Flight flight = new Flight("FL123", aircraft);
//        Booking booking = new Booking("BK001", flight);
//
//        // Simulate selling seats randomly
//        for (int i = 0; i < 10; i++) {
//            flight.assignRandomSeat();
//        }
//
//        // Allow manual seat selection
//        booking.chooseSeat(0, 0); // A1
//        booking.chooseSeat(1, 2); // C2
//
//        List<String> chart = flight.seatingChart();
//        for (String row : chart) {
//            System.out.println(row);
//        }
//    }
//}
