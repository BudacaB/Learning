// Function - input (argument), code, output (return value)

let greetUser = function () {
    console.log('Welcome user!')
}

greetUser()
greetUser()
greetUser()

let square = function (num) {
    let result = num * num
    return result
}

let value = square(3)
let otherValue = square(10)

console.log(value)
console.log(otherValue)

// Challenge Area

/* let fahrenheit = 50 // 0c - 273.15k
let celsius = (fahrenheit - 32) * 5 / 9
let kelvin = (fahrenheit + 459.67) * 5 / 9

console.log(celsius)
console.log(kelvin) */

// convertFahrrenheitToCelsius

let convertFahrrenheitToCelsius = function(fahrenheit) {
    let celsius = (fahrenheit - 32) * 5 / 9
    console.log(celsius)
}

// Call a couple of times(32 -> 0) (68 -> 20)

convertFahrrenheitToCelsius(32)
convertFahrrenheitToCelsius(68)

// print the converted values



