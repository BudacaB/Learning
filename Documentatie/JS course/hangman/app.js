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

// Making an HTTP request
const request = new XMLHttpRequest()

request.addEventListener('readystatechange', (e) => {
     if (e.target.readyState === 4 && e.target.status === 200) {
         const data = JSON.parse(e.target.responseText)
         console.log(data)
     } else if (e.target.readyState === 4) {
         console.log('An error has taken place')
     }
})

request.open('GET', 'http://puzzle.mead.io/puzzle?wordCount=3')
request.send()


const countryCode = 'RO'
const countriesRequest = new XMLHttpRequest()

countriesRequest.addEventListener('readystatechange', (e) => {
    if (e.target.readyState === 4 && e.target.status === 200) {
        const data = JSON.parse(e.target.responseText)
        // course solution
        const country = data.find((country) => country.alpha2Code === countryCode)
        console.log(country.name)

        // own solution
        // for (let countries in data) {
        //     let country = data[countries]
        //     if (country.alpha2Code === countryCode) {
        //         console.log(country.name)
        //     }
        // }
    } else if (e.target.readyState === 4) {
        console.log('Unable to fetch data')
    }
})

countriesRequest.open('GET', 'http://restcountries.eu/rest/v2/all')
countriesRequest.send()