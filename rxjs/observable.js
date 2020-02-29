const rxjs = require("rxjs");

let button = document.getElementById("testButton");
//let obs = rxjs.fromEvent(button, "click");

let observer = {
  next: value => console.log(value),
  error: error => console.log(error),
  complete: () => console.log("Completed")
};

//obs.subscribe(observer);

let subscription = rxjs.Observable.create(obs => {
  //   obs.next("A value");
  //   obs.error("Error");
  //   setTimeout(() => {
  //     obs.complete();
  //     obs.next("Another value");
  //   }, 2000);
  button.onclick = event => {
    obs.next(event);
  };
}).subscribe(observer);

setTimeout(() => {
  subscription.unsubscribe();
}, 5000);
