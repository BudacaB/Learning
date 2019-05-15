const Person = function (firstName, lastName, age) {
    this.firstName = firstName
    this.lastName = lastName
    this.age = age
}

const me = new Person('Jean', 'Cojean', 33)
console.log(me)

const person2 = new Person('Shady', 'Nasty', 55)
console.log(person2)