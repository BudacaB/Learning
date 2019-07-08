const puzzleEl = document.querySelector('#puzzle');
const statusEl = document.querySelector('#status');

const game1 = new Hangman ('Car Parts', 2);
puzzleEl.textContent = game1.puzzle;
statusEl.textContent = game1.statusMessage;

window.addEventListener('keypress', function(e) {
    const guess = String.fromCharCode(e.charCode);
    game1.makeGuess(guess);
    puzzleEl.textContent = game1.puzzle;
    statusEl.textContent = game1.statusMessage;

})

