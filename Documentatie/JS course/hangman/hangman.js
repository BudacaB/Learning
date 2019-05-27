const Hangman = function (word, remainingGuesses) {
    this.word = word.toLowerCase().split('')
    this.remainingGuesses = remainingGuesses
    this.guessedLetters = []
}

Hangman.prototype.getPuzzle = function() {
    let puzzle = []

    this.word.forEach((letter) => {
        if (this.guessedLetters.includes(letter) || letter === ' ') {
            puzzle += letter
        } else {
            puzzle += '*'
        }
    })

    return puzzle
}

Hangman.prototype.makeGuess = function(guess) {
    guess = guess.toLowerCase()
    if (!this.guessedLetters.includes(guess)) {
        this.guessedLetters.push(guess)
        if (this.remainingGuesses <= 0) { 
            console.log('0 guesses left') 
        } else if (!this.word.includes(guess)) {
            this.remainingGuesses--
        }
    } else {
        console.log('Letter has already been chosen')
    }

    // const isUnique = !this.guessedLetters.includes(guess)
    // const isBadGuess = !this.word.includes(guess)
    // if (isUnique) {
    //     this.guessedLetters.push(guess)
    // }
    // if (this.remainingGuesses > 0 && isUnique && isBadGuess) {
    //     this.remainingGuesses--
    // }
    
}

const game = new Hangman ('Cat', 2)
console.log(game.getPuzzle())
console.log(game.remainingGuesses)

window.addEventListener('keypress', function(e) {
    const guess = String.fromCharCode(e.charCode)
    game.makeGuess(guess)
    console.log(game.getPuzzle())
    console.log(game.remainingGuesses)
})