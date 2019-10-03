const printTeam = (team, coach, ...players) => {
  console.log(`Team: ${team}`);
  console.log(`Coach: ${coach}`);
  console.log(`Players: ${players.join(", ")}`);
};

const team = {
  name: "Liberty",
  coach: "Casey Penn",
  players: ["Marge", "Aiden", "Herbert"]
};

printTeam(team.name, team.coach, ...team.players);

let cities = ["Barcelona", "Cape Town", "Bordeaux"];
cities = [...cities, "Santiago"];

console.log(cities);

let house = {
  bedrooms: 2,
  bathrooms: 1.5,
  year: 2017
};
let newHouse = {
  basement: true,
  bedrooms: 3,
  ...house
};

console.log(house);
console.log(newHouse);

const person = {
  name: "Bog",
  age: 32
};

const location = {
  city: "Buch",
  country: "RO"
};

const overview = {
  ...person,
  ...location
};

console.log(overview);
