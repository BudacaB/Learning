const getPuzzle = async (wordCount) => {
    const response = await fetch(`http://puzzle.mead.io/puzzle?wordCount=${wordCount}`)
    
    if (response.status === 200) {
        const data = await response.json()
        return data.puzzle
    } else {
        throw new Error('Unable to get puzzle')
    }
}


// const getPuzzleSync = () => {
//     const request = new XMLHttpRequest()

//     request.open('GET', 'http://puzzle.mead.io/slow-puzzle?wordCount=3', false)
//     request.send()

//     if (request.readyState === 4 && request.status === 200) {
//         const data = JSON.parse(request.responseText)
//         return data.puzzle
//     } else if (request.readyState === 4) {
//         throw new Error('Things did not go well')
//     }
// }


const getCountry = async (countryCode) => {
    const response = await fetch('http://restcountries.eu/rest/v2/all')
        if (response.status === 200) {
            const data = await response.json()
            return data.find((country) => country.alpha2Code === countryCode)            
        } else {
            throw new Error('Unable to fetch country')
        }
}


const getLocation = async () => {
    const response = await fetch('http://ipinfo.io/json?token=4d7ae0b41b2815')
        if (response.status === 200) {
            return response.json()
        } else {
            throw new Error('Unable to fetch location')
        }
}


const getCurrentCountry = async () => {
    const location = await getLocation()
    return getCountry(location.country)
}