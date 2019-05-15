const Hangman = function (word, guesses) {
    this.word = word
    this.guesses = guesses
}

const game = new Hangman ('park', 3)
console.log(game)

const secondGame = new Hangman ('mountain', 5)
console.log(secondGame)