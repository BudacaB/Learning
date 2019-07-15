// HTTP (Hypertext Transfer Protocol)
// Request - what do we want to do
// Response - what was actually done

const puzzleEl = document.querySelector('#puzzle');
const statusEl = document.querySelector('#status');

const game1 = new Hangman ('Car Parts', 2);
puzzleEl.textContent = game1.puzzle;
statusEl.textContent = game1.statusMessage;

window.addEventListener('keypress', (e) => {
    const guess = String.fromCharCode(e.charCode);
    game1.makeGuess(guess);
    puzzleEl.textContent = game1.puzzle;
    statusEl.textContent = game1.statusMessage;
})

getPuzzle('2', (error, puzzle) => {
    if (error) {
        console.log(`Error: ${error}`)
    } else {
        console.log(puzzle)
    }
})

// Sync example
// const puzzle = getPuzzleSync()
// console.log(puzzle)

// console.log('Do something else')



getCountry('RO', (error, country) => {
    if (error) {
        console.log(`Error: ${error}`)
    } else {
        console.log(`Country name: ${country.name}`)
    }
})


