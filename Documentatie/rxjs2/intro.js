let arr = ["1", "3", "foo", "5", "7", "bar"];

let result = arr
  .map(x => parseInt(x))
  .filter(x => !isNaN(x))
  .reduce((x, y) => x + y);

let pipe = (...fns) => {
  return arg => fns.reduce((prev, fn) => fn(prev), arg);
};

let add = arr => arr.reduce((x, y) => x + y);
let fil = arr => arr.filter(x => !isNaN(x));
let mapper = arr => arr.map(x => parseInt(x));

let res = pipe(mapper, fil, add)(arr);

console.log(result);
console.log(res);
