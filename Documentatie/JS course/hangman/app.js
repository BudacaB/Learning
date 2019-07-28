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


getPuzzle('2').then((puzzle) => {
    console.log(puzzle)
}).catch((err) => {
    console.log(err)
})


getCountry('RO').then((country) => {
    console.log(country.name)
}).catch((err) => {
    console.log(err)
})


getLocation().then((location) => {
    console.log(`I am in country ${location.country}, city ${location.city}, region ${location.region}`)
}).catch((err) => {
    console.log(err)
})


getLocation().then((location) => {
    return getCountry(location.country)
}).then((country) => {
    console.log(country.name)
}).catch((err) => {
    console.log(err)
})

