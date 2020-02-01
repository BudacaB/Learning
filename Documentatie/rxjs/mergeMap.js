const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

let input1 = document.querySelector("#input1");
let input2 = document.querySelector("#input2");
let span = document.querySelector("span");

let obs1 = rxjs.fromEvent(input1, "input");
let obs2 = rxjs.fromEvent(input2, "input");

let mergeMapOp = rxjsOp.mergeMap(event1 => {
  let mapOp = rxjsOp.map(
    event2 => event1.target.value + " " + event2.target.value
  );
  return mapOp(obs2);
});

mergeMapOp(obs1).subscribe(combinedValue => (span.textContent = combinedValue));
