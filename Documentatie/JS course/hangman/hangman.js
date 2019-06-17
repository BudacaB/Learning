const Hangman = function (word, remainingGuesses) {
    this.word = word.toLowerCase().split('')
    this.remainingGuesses = remainingGuesses
    this.guessedLetters = []
    this.status = 'playing'
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
        if (this.remainingGuesses === 0) { 
            console.log('0 guesses left') 
        } else if (!this.word.includes(guess)) {
            this.remainingGuesses--
        }
    } else {
        console.log('Letter has already been chosen')
    } 

    this.getStatus();
}

Hangman.prototype.getStatus = function() {
    const finished = this.word.every((letter) => this.guessedLetters.includes(letter))

    if (this.remainingGuesses === 0) {
        this.status = 'failed'
    } else if (finished) {
        this.status = 'finished'
    } else {
        this.status = 'playing'
    }
}

