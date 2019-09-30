// the Rest parameter

const calculateAverage = (thing, ...numbers) => {
  //return (num1 + num2) / 2;
  let sum = 0;
  numbers.forEach(num => (sum += num));
  const average = sum / numbers.length;
  return `The average ${thing} is ${average}`;
};

console.log(calculateAverage("age", 0, 100, 88, 64));

function printTeam(team, coach, ...players) {
  console.log(`Team: ${team}`);
  console.log(`Coach: ${coach}`);
  console.log(`Players: ${players.join(", ")}`);
}

printTeam("Liberty", "Casey Penn", "Marge", "Aiden", "Herbert");
