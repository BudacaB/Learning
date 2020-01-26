const numbers = [1, 2, 3];
const sumReducer = (acc, cur) => {
  return acc + cur;
};

const reducer = (func, intialAccValue, arr) => {
  let accValue = intialAccValue;
  for (i = 0; i < arr.length; i++) {
    let current = arr[i];
    accValue = func(accValue, current);
  }
  return accValue;
};

let result = reducer(sumReducer, 0, numbers);
console.log(result);
