const bookings = [
  {
    "booking_ID": 1,
    "flight_ID": 1,
    "passenger_ID": 1,
    "seatRow": 10,
    "seatColumn": 3
  },
  {
    "booking_ID": 2,
    "flight_ID": 2,
    "passenger_ID": 2,
    "seatRow": 7,
    "seatColumn": 2
  },
  {
    "booking_ID": 3,
    "flight_ID": 1,
    "passenger_ID": 3,
    "seatRow": 12,
    "seatColumn": 5
  },
  {
    "booking_ID": 4,
    "flight_ID": 3,
    "passenger_ID": 4,
    "seatRow": 5,
    "seatColumn": 1
  },
  {
    "booking_ID": 5,
    "flight_ID": 4,
    "passenger_ID": 5,
    "seatRow": 8,
    "seatColumn": 4
  },
  {
    "booking_ID": 6,
    "flight_ID": 1,
    "passenger_ID": 6,
    "seatRow": 3,
    "seatColumn": 2
  },
  {
    "booking_ID": 7,
    "flight_ID": 2,
    "passenger_ID": 7,
    "seatRow": 6,
    "seatColumn": 1
  },
  {
    "booking_ID": 8,
    "flight_ID": 3,
    "passenger_ID": 8,
    "seatRow": 9,
    "seatColumn": 3
  },
  {
    "booking_ID": 9,
    "flight_ID": 4,
    "passenger_ID": 9,
    "seatRow": 4,
    "seatColumn": 5
  },
  {
    "booking_ID": 10,
    "flight_ID": 1,
    "passenger_ID": 10,
    "seatRow": 11,
    "seatColumn": 4
  },
  {
    "booking_ID": 11,
    "flight_ID": 2,
    "passenger_ID": 11,
    "seatRow": 8,
    "seatColumn": 6
  },
  {
    "booking_ID": 12,
    "flight_ID": 3,
    "passenger_ID": 12,
    "seatRow": 5,
    "seatColumn": 2
  },
  {
    "booking_ID": 13,
    "flight_ID": 4,
    "passenger_ID": 13,
    "seatRow": 10,
    "seatColumn": 1
  },
  {
    "booking_ID": 14,
    "flight_ID": 1,
    "passenger_ID": 14,
    "seatRow": 7,
    "seatColumn": 3
  },
  {
    "booking_ID": 15,
    "flight_ID": 2,
    "passenger_ID": 15,
    "seatRow": 12,
    "seatColumn": 2
  },
  {
    "booking_ID": 16,
    "flight_ID": 3,
    "passenger_ID": 16,
    "seatRow": 6,
    "seatColumn": 4
  },
  {
    "booking_ID": 17,
    "flight_ID": 4,
    "passenger_ID": 17,
    "seatRow": 9,
    "seatColumn": 5
  },
  {
    "booking_ID": 18,
    "flight_ID": 1,
    "passenger_ID": 18,
    "seatRow": 4,
    "seatColumn": 3
  },
  {
    "booking_ID": 19,
    "flight_ID": 2,
    "passenger_ID": 19,
    "seatRow": 11,
    "seatColumn": 2
  }
];
  for (let i = 0; i < bookings.length; i++) {
    const booking = bookings[i];
    pm.sendRequest({
      url: 'http://localhost:8080/flight/book',
      method: 'POST',
      header: 'Content-Type:application/json',
      body: JSON.stringify((booking))
    }, function (err, response) {
      if (err) {
        console.error(err);
        return;
      }

      console.log(response.body);
    });
  }
