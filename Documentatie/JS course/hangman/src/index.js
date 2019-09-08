import Hangman from './hangman'
import getPuzzle from './requests'

const puzzleEl = document.querySelector('#puzzle');
const statusEl = document.querySelector('#status');
let game1

window.addEventListener('keypress', (e) => {
    const guess = String.fromCharCode(e.charCode);
    game1.makeGuess(guess);
    render()
})

const render = () => {
    puzzleEl.innerHTML = '';
    statusEl.textContent = game1.statusMessage;

    game1.puzzle.split('').forEach((letter) =>{
        puzzleEl.innerHTML = puzzleEl.innerHTML.concat('<span>' + letter + '</span>')
    })

}

const startGame = async () => {
    const puzzle = await getPuzzle('2')
    game1 = new Hangman(puzzle, 5)
    render()
}

document.querySelector('#reset').addEventListener('click', startGame)

startGame()