const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

let input = document.querySelector("input");
let observable = rxjs.fromEvent(input, "input");
let debounceOp = rxjsOp.debounceTime(1000);
let distinctOp = rxjsOp.distinctUntilChanged();
let mapOp = rxjsOp.map(event => event.target.value);

distinctOp(debounceOp(mapOp(observable))).subscribe({
  next: value => console.log(value)
});
