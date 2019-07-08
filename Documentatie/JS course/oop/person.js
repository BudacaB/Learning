// Prototypal Inheritance
// myPerson --> Person.prototype --> Object.prototype --> null

class Person{
    constructor(firstName, lastName, age, likes = []) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
        this.likes = likes
    }
    getBio() {
        let bio = `${this.firstName} is ${this.age}.`
        this.likes.forEach((like) => {
            bio += ` ${this.firstName} likes ${like}.`
        }) 
        return bio
    }
    set fullName(fullName) {
        const names = fullName.split(' ')
        this.firstName = names[0]
        this.lastName = names[1]
    }
    get fullName() {
        return `${this.firstName} ${this.lastName}`
    }
}

class Employee extends Person {
    constructor(firstName, lastName, age, position, likes) {
        super(firstName, lastName, age, likes)
        this.position = position
    }
    getBio() {
        return `${this.fullName} is a ${this.position}.`
    }
    getYearsLeft() {
        return 65 - this.age
    }
}

// const me = new Employee('Jean', 'Cojean', 33, 'Teacher', ['Teaching', 'Biking'])
// me.setName('Alexis Cichi')
// console.log(me.getBio())
// console.log(me.getYearsLeft())

// const person2 = new Person('Shady', 'Nasty', 55)
// console.log(person2.getBio())

class Student extends Person {
    constructor(firstName, lastName, age, grade, likes) {
        super(firstName, lastName, age, likes)
        this.grade = grade
    }
    getBio() {
        return (70 <= this.grade) ? `${this.firstName} is passing the course` : `${this.firstName} is failing the course`
    }
    updateGrade(change) {
        this.grade += change
    }
}

const student = new Student('Bog', 'Dan', 31, 99, ['Hiking', 'Biking'])
student.fullName = 'Jabar Kass'
console.log(student.getBio())
student.updateGrade(-30)
console.log(student.getBio())
student.updateGrade(6)
console.log(student.getBio())

const emp = new Employee('Bog', 'Dan', 25, 'Teacher', [])
emp.fullName = 'Crag Hack'
console.log(emp.getBio())