const puzzleEl = document.querySelector('#puzzle');
const statusEl = document.querySelector('#status');

const game1 = new Hangman ('Cat', 2);
puzzleEl.textContent = game1.getPuzzle();
statusEl.textContent = game1.returnStatusMessage();

window.addEventListener('keypress', function(e) {
    const guess = String.fromCharCode(e.charCode);
    game1.makeGuess(guess);
    puzzleEl.textContent = game1.getPuzzle();
    statusEl.textContent = game1.returnStatusMessage();

})

