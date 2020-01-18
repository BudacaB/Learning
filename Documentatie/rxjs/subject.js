// subject inherits from observable -> can call next() on it to have it emit a value if needed

const rxjs = require("rxjs");

var subject = new rxjs.Subject();

subject.subscribe({
  next: function(value) {
    console.log(value);
  },
  error: function(error) {
    console.log(error);
  },
  complete: function() {
    console.log("Complete");
  }
});

subject.subscribe({
  next: function(value) {
    console.log(value);
  }
});

subject.next("A new data piece");
subject.complete();
subject.next("A new data piece again");
