const square = (num) => num * num

const squareLong = (num) => {
    return num * num
}

console.log(square(5))

const ppl = [{
    name: 'Bogdan',
    age: 31
}, {
    name: 'Jean',
    age: 99
}, {
    name: 'Cichi',
    age: 22
}]

// const under30 = ppl.filter(function(person) {
//     return person.age < 30
// })

const under30 = ppl.filter(person => person.age < 30)
console.log(under30)

const aged22 = ppl.find(person => person.age === 22)
console.log(aged22.name)