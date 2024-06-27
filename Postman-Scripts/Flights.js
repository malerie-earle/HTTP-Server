const flights = [
  {
    "flight_ID": 1,
    "flight_number": "FL1",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "aircraft": {
      "aircraft_ID": 1,
      "model": "Boeing 737",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 160,
      "rows": 27,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-17T12:00:00",
    "arrival_time": "2024-06-17T15:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 2,
    "flight_number": "FL2",
    "destination": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "origin": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "aircraft": {
      "aircraft_ID": 2,
      "model": "Airbus A320",
      "manufacturer": "Airbus",
      "airline": "WestJet",
      "capacity": 180,
      "rows": 30,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-18T08:00:00",
    "arrival_time": "2024-06-18T10:00:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 3,
    "flight_number": "FL3",
    "destination": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "origin": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "aircraft": {
      "aircraft_ID": 5,
      "model": "Boeing 787 Dreamliner",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 250,
      "rows": 43,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-19T14:00:00",
    "arrival_time": "2024-06-19T18:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 4,
    "flight_number": "FL4",
    "destination": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "origin": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 4,
      "model": "Boeing 777",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 300,
      "rows": 50,
      "columns": 10,
      "numAisles": 2
    },
    "departure_time": "2024-06-20T10:00:00",
    "arrival_time": "2024-06-20T12:30:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 5,
    "flight_number": "FL5",
    "destination": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 1,
      "model": "Boeing 737",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 160,
      "rows": 27,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-21T09:30:00",
    "arrival_time": "2024-06-21T10:45:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 6,
    "flight_number": "FL6",
    "destination": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "aircraft": {
      "aircraft_ID": 6,
      "model": "Airbus A220",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 135,
      "rows": 25,
      "columns": 5,
      "numAisles": 1
    },
    "departure_time": "2024-06-22T11:00:00",
    "arrival_time": "2024-06-22T13:30:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 7,
    "flight_number": "FL7",
    "destination": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "origin": {
      "airport_ID": 8,
      "code": "YYT",
      "name": "St. John's International Airport",
      "city": "St. John's",
      "province": "Newfoundland and Labrador"
    },
    "aircraft": {
      "aircraft_ID": 3,
      "model": "Bombardier Dash 8 Q400",
      "manufacturer": "Bombardier",
      "airline": "Air Canada Express",
      "capacity": 78,
      "rows": 20,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-23T16:00:00",
    "arrival_time": "2024-06-23T19:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 8,
    "flight_number": "FL8",
    "destination": {
      "airport_ID": 8,
      "code": "YYT",
      "name": "St. John's International Airport",
      "city": "St. John's",
      "province": "Newfoundland and Labrador"
    },
    "origin": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 9,
      "model": "Embraer E175",
      "manufacturer": "Embraer",
      "airline": "Air Canada Express",
      "capacity": 76,
      "rows": 19,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-24T18:30:00",
    "arrival_time": "2024-06-24T21:00:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 9,
    "flight_number": "FL9",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "aircraft": {
      "aircraft_ID": 7,
      "model": "Boeing 767",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 250,
      "rows": 42,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-25T07:00:00",
    "arrival_time": "2024-06-25T10:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 10,
    "flight_number": "FL10",
    "destination": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "origin": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 8,
      "model": "Airbus A350",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 300,
      "rows": 50,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-25T14:00:00",
    "arrival_time": "2024-06-25T22:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 11,
    "flight_number": "FL11",
    "destination": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "origin": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 1,
      "model": "Boeing 737",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 160,
      "rows": 27,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-26T10:00:00",
    "arrival_time": "2024-06-26T12:00:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 12,
    "flight_number": "FL12",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 6,
      "model": "Airbus A220",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 135,
      "rows": 25,
      "columns": 5,
      "numAisles": 1
    },
    "departure_time": "2024-06-26T14:30:00",
    "arrival_time": "2024-06-26T15:45:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 13,
    "flight_number": "FL13",
    "destination": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 8,
      "code": "YYT",
      "name": "St. John's International Airport",
      "city": "St. John's",
      "province": "Newfoundland and Labrador"
    },
    "aircraft": {
      "aircraft_ID": 3,
      "model": "Bombardier Dash 8 Q400",
      "manufacturer": "Bombardier",
      "airline": "Air Canada Express",
      "capacity": 78,
      "rows": 20,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-27T08:00:00",
    "arrival_time": "2024-06-27T12:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 14,
    "flight_number": "FL14",
    "destination": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "origin": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "aircraft": {
      "aircraft_ID": 2,
      "model": "Airbus A320",
      "manufacturer": "Airbus",
      "airline": "WestJet",
      "capacity": 180,
      "rows": 30,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-27T09:00:00",
    "arrival_time": "2024-06-27T10:30:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 15,
    "flight_number": "FL15",
    "destination": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "origin": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 9,
      "model": "Embraer E175",
      "manufacturer": "Embraer",
      "airline": "Air Canada Express",
      "capacity": 76,
      "rows": 19,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-27T12:00:00",
    "arrival_time": "2024-06-27T14:30:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 16,
    "flight_number": "FL16",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "aircraft": {
      "aircraft_ID": 6,
      "model": "Airbus A220",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 135,
      "rows": 25,
      "columns": 5,
      "numAisles": 1
    },
    "departure_time": "2024-06-28T09:00:00",
    "arrival_time": "2024-06-28T11:30:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 17,
    "flight_number": "FL17",
    "destination": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 1,
      "model": "Boeing 737",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 160,
      "rows": 27,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-06-28T13:00:00",
    "arrival_time": "2024-06-28T14:15:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 18,
    "flight_number": "FL18",
    "destination": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "origin": {
      "airport_ID": 8,
      "code": "YYT",
      "name": "St. John's International Airport",
      "city": "St. John's",
      "province": "Newfoundland and Labrador"
    },
    "aircraft": {
      "aircraft_ID": 5,
      "model": "Boeing 787",
      "manufacturer": "Boeing",
      "airline": "WestJet",
      "capacity": 290,
      "rows": 48,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-28T15:00:00",
    "arrival_time": "2024-06-28T22:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 19,
    "flight_number": "FL19",
    "destination": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "origin": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "aircraft": {
      "aircraft_ID": 7,
      "model": "Boeing 767",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 250,
      "rows": 42,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-28T16:00:00",
    "arrival_time": "2024-06-28T19:00:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 20,
    "flight_number": "FL20",
    "destination": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "aircraft": {
      "aircraft_ID": 8,
      "model": "Airbus A350",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 300,
      "rows": 50,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-29T09:00:00",
    "arrival_time": "2024-06-29T11:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 21,
    "flight_number": "FL21",
    "destination": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "aircraft": {
      "aircraft_ID": 9,
      "model": "Embraer E175",
      "manufacturer": "Embraer",
      "airline": "Air Canada Express",
      "capacity": 76,
      "rows": 19,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-29T14:00:00",
    "arrival_time": "2024-06-29T16:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 22,
    "flight_number": "FL22",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "aircraft": {
      "aircraft_ID": 3,
      "model": "Bombardier Dash 8 Q400",
      "manufacturer": "Bombardier",
      "airline": "Air Canada Express",
      "capacity": 78,
      "rows": 20,
      "columns": 4,
      "numAisles": 1
    },
    "departure_time": "2024-06-29T18:00:00",
    "arrival_time": "2024-06-29T19:30:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 23,
    "flight_number": "FL23",
    "destination": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 6,
      "model": "Airbus A220",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 135,
      "rows": 25,
      "columns": 5,
      "numAisles": 1
    },
    "departure_time": "2024-06-30T09:00:00",
    "arrival_time": "2024-06-30T10:15:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 24,
    "flight_number": "FL24",
    "destination": {
      "airport_ID": 7,
      "code": "YHZ",
      "name": "Halifax Stanfield International Airport",
      "city": "Halifax",
      "province": "Nova Scotia"
    },
    "origin": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "aircraft": {
      "aircraft_ID": 7,
      "model": "Boeing 767",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 250,
      "rows": 42,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-06-30T12:00:00",
    "arrival_time": "2024-06-30T16:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 25,
    "flight_number": "FL25",
    "destination": {
      "airport_ID": 8,
      "code": "YYT",
      "name": "St. John's International Airport",
      "city": "St. John's",
      "province": "Newfoundland and Labrador"
    },
    "origin": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 8,
      "model": "Airbus A350",
      "manufacturer": "Airbus",
      "airline": "Air Canada",
      "capacity": 300,
      "rows": 50,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-07-01T08:00:00",
    "arrival_time": "2024-07-01T12:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 26,
    "flight_number": "FL26",
    "destination": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 3,
      "code": "YYC",
      "name": "Calgary International Airport",
      "city": "Calgary",
      "province": "Alberta"
    },
    "aircraft": {
      "aircraft_ID": 1,
      "model": "Boeing 737",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 160,
      "rows": 27,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-07-01T10:00:00",
    "arrival_time": "2024-07-01T12:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 27,
    "flight_number": "FL27",
    "destination": {
      "airport_ID": 2,
      "code": "YVR",
      "name": "Vancouver International Airport",
      "city": "Vancouver",
      "province": "British Columbia"
    },
    "origin": {
      "airport_ID": 6,
      "code": "YOW",
      "name": "Ottawa Macdonald-Cartier International Airport",
      "city": "Ottawa",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 2,
      "model": "Airbus A320",
      "manufacturer": "Airbus",
      "airline": "WestJet",
      "capacity": 180,
      "rows": 30,
      "columns": 6,
      "numAisles": 1
    },
    "departure_time": "2024-07-01T12:00:00",
    "arrival_time": "2024-07-01T18:00:00",
    "status": "DELAYED"
  },
  {
    "flight_ID": 28,
    "flight_number": "FL28",
    "destination": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "origin": {
      "airport_ID": 5,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "aircraft": {
      "aircraft_ID": 5,
      "model": "Boeing 787",
      "manufacturer": "Boeing",
      "airline": "WestJet",
      "capacity": 290,
      "rows": 48,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-07-01T15:00:00",
    "arrival_time": "2024-07-01T17:00:00",
    "status": "ON_TIME"
  },
  {
    "flight_ID": 29,
    "flight_number": "FL29",
    "destination": {
      "airport_ID": 1,
      "code": "YYZ",
      "name": "Toronto Pearson International Airport",
      "city": "Toronto",
      "province": "Ontario"
    },
    "origin": {
      "airport_ID": 4,
      "code": "YUL",
      "name": "Montréal-Pierre Elliott Trudeau International Airport",
      "city": "Montreal",
      "province": "Quebec"
    },
    "aircraft": {
      "aircraft_ID": 7,
      "model": "Boeing 767",
      "manufacturer": "Boeing",
      "airline": "Air Canada",
      "capacity": 250,
      "rows": 42,
      "columns": 9,
      "numAisles": 2
    },
    "departure_time": "2024-07-01T18:00:00",
    "arrival_time": "2024-07-01T19:30:00",
    "status": "DELAYED"
  }
];
   for (let i = 0; i < flights.length; i++) {
     const flight = flights[i];
     pm.sendRequest({
       url: 'http://localhost:8080/flight',
       method: 'POST',
       header: 'Content-Type:application/json',
       body: JSON.stringify(flight)
     }, function (err, response) {
       if (err) {
         console.error(err);
         return;
       }

       console.log(response.body);
     });
   }

