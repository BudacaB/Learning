const Hangman = function (word, remainingGuesses) {
    this.word = word.toLowerCase().split('')
    this.remainingGuesses = remainingGuesses
    this.guessedLetters = ['c', 'e']
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

const game = new Hangman ('Cat', 2)
console.log(game.getPuzzle())

const secondGame = new Hangman ('New Jersey', 4)
console.log(secondGame.getPuzzle())