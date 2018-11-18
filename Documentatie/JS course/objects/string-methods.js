let name = ' Andrew Mead '

// Length property
console.log(name.length)

// Convert to uppercase
console.log(name.toUpperCase())

// Convert to lower case
console.log(name.toLowerCase())

// Includes method
let password = 'abc123pdfdf098'
console.log(password.includes('password'))

// Trim
console.log(name.trim())

// Challenge area

// isValidPassword
// length is more than 8 - and it doesn't contain the word password

let isValidPassword = function (password) {
    return (password.length > 8 && !password.includes('password'))
}

console.log(isValidPassword('asdfg'))
console.log(isValidPassword('abc123!@#'))
console.log(isValidPassword('dsfdsfdsfdsfdpassword'))