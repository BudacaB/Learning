// HTTP (Hypertext Transfer Protocol)
// Request - what do we want to do
// Response - what was actually done

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

    //own solution
    game1.puzzle.split('').forEach((letter) =>{
        puzzleEl.innerHTML = puzzleEl.innerHTML.concat('<span>' + letter + '</span>')
    })

    //course solution
    // game1.puzzle.split('').forEach((letter) =>{
    //     const letterEl = document.createElement('span')
    //     letterEl.textContent = letter
    //     puzzleEl.appendChild(letterEl)
    // })
}

const startGame = async () => {
    const puzzle = await getPuzzle('2')
    game1 = new Hangman(puzzle, 5)
    render()
}

document.querySelector('#reset').addEventListener('click', startGame)

startGame()



// getPuzzle('2').then((puzzle) => {
//     console.log(puzzle)
// }).catch((err) => {
//     console.log(err)
// })






// getCountry('RO').then((country) => {
//     console.log(country.name)
// }).catch((err) => {
//     console.log(err)
// })


// getLocation().then((location) => {
//     console.log(`I am in country ${location.country}, city ${location.city}, region ${location.region}`)
// }).catch((err) => {
//     console.log(err)
// })


// getCurrentCountry().then((country) => {
//     console.log(country.name)
// }).catch((error) => {
//     console.log(error)
// })

