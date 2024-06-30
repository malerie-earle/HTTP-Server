const passengers = [
{
  "passenger_ID": 1,
  "first_name": "Alice",
  "last_name": "Smith",
  "email": "alice.smith@gmail.com"
},
{
  "passenger_ID": 2,
  "first_name": "Bob",
  "last_name": "Johnson",
  "email": "bob.johnson@yahoo.com"
},
{
  "passenger_ID": 3,
  "first_name": "Carol",
  "last_name": "Williams",
  "email": "carol.williams@hotmail.com"
},
{
  "passenger_ID": 4,
  "first_name": "David",
  "last_name": "Brown",
  "email": "david.brown@aol.com"
},
{
  "passenger_ID": 5,
  "first_name": "Emma",
  "last_name": "Jones",
  "email": "emma.jones@outlook.com"
},
{
  "passenger_ID": 6,
  "first_name": "Frank",
  "last_name": "Davis",
  "email": "frank.davis@icloud.com"
},
{
  "passenger_ID": 7,
  "first_name": "Grace",
  "last_name": "Miller",
  "email": "grace.miller@protonmail.com"
},
{
  "passenger_ID": 8,
  "first_name": "Henry",
  "last_name": "Wilson",
  "email": "henry.wilson@yandex.com"
},
{
  "passenger_ID": 9,
  "first_name": "Isabella",
  "last_name": "Moore",
  "email": "isabella.moore@zoho.com"
},
{
  "passenger_ID": 10,
  "first_name": "Jack",
  "last_name": "Taylor",
  "email": "jack.taylor@mail.com"
},
{
  "passenger_ID": 11,
  "first_name": "Karen",
  "last_name": "Anderson",
  "email": "karen.anderson@inbox.com"
},
{
  "passenger_ID": 12,
  "first_name": "Leo",
  "last_name": "Thomas",
  "email": "leo.thomas@fastmail.com"
},
{
  "passenger_ID": 13,
  "first_name": "Mia",
  "last_name": "Harris",
  "email": "mia.harris@zoho.eu"
},
{
  "passenger_ID": 14,
  "first_name": "Nathan",
  "last_name": "Martin",
  "email": "nathan.martin@yandex.ru"
},
{
  "passenger_ID": 15,
  "first_name": "Olivia",
  "last_name": "Thompson",
  "email": "olivia.thompson@mail.ru"
},
{
  "passenger_ID": 16,
  "first_name": "Peter",
  "last_name": "Garcia",
  "email": "peter.garcia@outlook.es"
},
{
  "passenger_ID": 17,
  "first_name": "Quinn",
  "last_name": "Roberts",
  "email": "quinn.roberts@gmail.co.uk"
},
{
  "passenger_ID": 18,
  "first_name": "Rachel",
  "last_name": "Clark",
  "email": "rachel.clark@hotmail.fr"
},
{
  "passenger_ID": 19,
  "first_name": "Samuel",
  "last_name": "Lewis",
  "email": "samuel.lewis@yahoo.com.au"
},
{
  "passenger_ID": 20,
  "first_name": "Taylor",
  "last_name": "Walker",
  "email": "taylor.walker@protonmail.ch"
}
];

for (let i = 0; i < passengers.length; i++) {
const passenger = passengers[i];
pm.sendRequest({
url: 'http://localhost:8080/passenger/',
method: 'POST',
header: 'Content-Type:application/json',
body: JSON.stringify(passenger)
}, function (err, response) {
if (err) {
console.error(err);
return;
}

console.log(response.body);
});
}
