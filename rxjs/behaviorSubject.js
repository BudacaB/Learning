const rxjs = require("rxjs");

let button = document.querySelector("button");
let div = document.querySelector("div");

let clickEmitted = new rxjs.BehaviorSubject("Not clicked");

button.addEventListener("click", () => {
  clickEmitted.next("Clicked!");
});

clickEmitted.subscribe(value => (div.textContent = value));
