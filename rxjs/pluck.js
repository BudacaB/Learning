const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

let input = document.querySelector("input");
var observable = rxjs.fromEvent(input, "input");

let debounceOp = rxjsOp.debounceTime(500);
let distinctOp = rxjsOp.distinctUntilChanged();

//let mapOp = rxjsOp.map(event => event.target.value);
let pluckOp = rxjsOp.pluck("target", "value");

distinctOp(debounceOp(pluckOp(observable))).subscribe({
  next: value => console.log(value)
});
