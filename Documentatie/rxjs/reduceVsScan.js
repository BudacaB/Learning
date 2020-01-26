const rxjs = require("rxjs");
const rxjsOp = require("rxjs/operators");

var observable = rxjs.of(1, 2, 3, 4, 5);

// reduce needs the observable to complete
// let reduceFunc = rxjsOp.reduce(
//   (total, currentValue) => total + currentValue,
//   0
// );

// scan doesn't need the observable to complete
let scanFunc = rxjsOp.scan((total, currentValue) => total + currentValue, 0);

// reduceFunc(observable).subscribe({
//   next: value => console.log(value)
// });

scanFunc(observable).subscribe({
  next: value => console.log(value)
});
