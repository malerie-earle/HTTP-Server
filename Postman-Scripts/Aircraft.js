const aircrafts = [
  {
    "aircraft_ID": 1,
    "model": "Boeing 737",
    "airline": "Air Canada",
    "capacity": 160,
    "rows": 27,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 2,
    "model": "Airbus A320",
    "airline": "WestJet",
    "capacity": 180,
    "rows": 30,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 3,
    "model": "Bombardier Dash 8 Q400",
    "airline": "Air Canada Express",
    "capacity": 78,
    "rows": 20,
    "columns": 4,
    "numAisles": 1
  },
  {
    "aircraft_ID": 4,
    "model": "Boeing 777",
    "airline": "Air Canada",
    "capacity": 300,
    "rows": 50,
    "columns": 10,
    "numAisles": 2
  },
  {
    "aircraft_ID": 5,
    "model": "Boeing 787 Dreamliner",
    "airline": "Air Canada",
    "capacity": 250,
    "rows": 43,
    "columns": 9,
    "numAisles": 2
  },
  {
    "aircraft_ID": 6,
    "model": "Airbus A220",
    "airline": "Air Canada",
    "capacity": 135,
    "rows": 25,
    "columns": 5,
    "numAisles": 1
  },
  {
    "aircraft_ID": 7,
    "model": "Boeing 767",
    "airline": "WestJet",
    "capacity": 250,
    "rows": 42,
    "columns": 8,
    "numAisles": 2
  },
  {
    "aircraft_ID": 8,
    "model": "Airbus A330",
    "airline": "Air Transat",
    "capacity": 335,
    "rows": 60,
    "columns": 9,
    "numAisles": 2
  },
  {
    "aircraft_ID": 9,
    "model": "Embraer E175",
    "airline": "Air Canada Express",
    "capacity": 76,
    "rows": 19,
    "columns": 4,
    "numAisles": 1
  },
  {
    "aircraft_ID": 10,
    "model": "Bombardier CRJ Series",
    "airline": "Air Canada Jazz",
    "capacity": 50,
    "rows": 13,
    "columns": 4,
    "numAisles": 1
  },
  {
    "aircraft_ID": 11,
    "model": "Boeing 737 MAX",
    "airline": "WestJet",
    "capacity": 172,
    "rows": 29,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 12,
    "model": "Airbus A321",
    "airline": "Air Canada Rouge",
    "capacity": 200,
    "rows": 34,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 13,
    "model": "Boeing 747",
    "airline": "Air Canada Cargo",
    "capacity": 400,
    "rows": 66,
    "columns": 10,
    "numAisles": 2
  },
  {
    "aircraft_ID": 14,
    "model": "Airbus A319",
    "airline": "Air Canada",
    "capacity": 144,
    "rows": 24,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 15,
    "model": "Boeing 757",
    "airline": "Air Canada Rouge",
    "capacity": 200,
    "rows": 38,
    "columns": 6,
    "numAisles": 1
  },
  {
    "aircraft_ID": 16,
    "model": "Bombardier Global 6000",
    "airline": "Air Canada Jetz",
    "capacity": 13,
    "rows": 4,
    "columns": 2,
    "numAisles": 1
  },
  {
    "aircraft_ID": 17,
    "model": "Airbus A330neo",
    "airline": "Air Transat",
    "capacity": 375,
    "rows": 63,
    "columns": 9,
    "numAisles": 2
  },
  {
    "aircraft_ID": 18,
    "model": "Boeing 767 Freighter",
    "airline": "Cargojet Airways",
    "capacity": 420,
    "rows": 70,
    "columns": 9,
    "numAisles": 2
  },
  {
    "aircraft_ID": 19,
    "model": "De Havilland Canada Dash 7",
    "airline": "Air BC",
    "capacity": 50,
    "rows": 12,
    "columns": 4,
    "numAisles": 1
  },
  {
    "aircraft_ID": 20,
    "model": "Cessna Citation X",
    "airline": "Private/Corporate",
    "capacity": 8,
    "rows": 2,
    "columns": 2,
    "numAisles": 1
  }
];
for (let i = 0; i < aircrafts.length; i++) {
  const aircraft = aircrafts[i];
  pm.sendRequest({
    url: 'http://localhost:8080/aircraft/createAircraft',
    method: 'POST',
    header: 'Content-Type:application/json',
    body: JSON.stringify(aircraft)
  }, function (err, response) {
    if (err) {
      console.error(err);
      return;
    }

    console.log(response.body);
  });
}
