// Lexical Scope (Static Scope)
// Global scope - Defined outside of all code blocks
// Local scope - Defined inside a code block

// In a scope you can access variable defined in that scope, or in any parent/acenstor scope

// Global scope (varOne)
    // Local scope (varTwo)
        // Local scope (varFour)
    // Local scope (varThree)

let varOne = 'varOne'

if (true) {
    console.log(varOne)
    let varTwo = 'varTwo'
    console.log(varTwo)

    if (true) {
        let varFour = 'varFour'
    }
}

if (true) {
    let varThree = 'varThree'
}

console.log(varTwo)