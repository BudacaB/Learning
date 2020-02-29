const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

let observable = rxjs.interval(1000);
let filterOp = rxjsOp.filter(value => value % 2 == 0);

filterOp(observable).subscribe({
  next: value => console.log(value),
  error: error => console.log("Error: ", error)
});
