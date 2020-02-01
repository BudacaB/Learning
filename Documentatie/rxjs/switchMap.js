const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

let button = document.querySelector("button");

let obs1 = rxjs.fromEvent(button, "click");
let obs2 = rxjs.interval(1000);

//obs1.subscribe(event => obs2.subscribe(value => console.log(value)));

let switchMapOp = rxjsOp.switchMap(event => obs2);
switchMapOp(obs1).subscribe(value => console.log(value));
