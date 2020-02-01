const rxjs = require("rxjs");

let button = document.querySelector("button");

let obs1 = rxjs.fromEvent(button, "click");
