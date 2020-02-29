//Scrie o functie care sa-ti intoarca un array care contine 2 elemente: ziua de astazi ca string in formatul de la ex3, si ziua de maine in acelasi format

/*
const currentDate = () => {

    const z = new Date()

    //weekday
    const weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    //month
    const monthNames = ["January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
    ]

    console.log(weekdays[z.getDay()] + ', ' + z.getDate() + ' ' + monthNames[z.getMonth()] + ' ' + z.getFullYear())
    
}

currentDate()
*/

/*
const currentDate = () => {

    const z = new Date()

    //weekday
    const weekdays = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"]

    //month
    const monthNames = ["January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"
    ]

    console.log(weekdays[z.getDay()] + ', ' + z.getDate() + ' ' + monthNames[z.getMonth()] + ' ' + z.getFullYear())
    
    z.setDate(z.getDate()+1);
    console.log(z);   
}

currentDate()
*/




const currentDate = () => {
    let z = new Date()
    let moment = require('moment')
    let today = moment(z).format('dddd, D MMMM YYYY')
    let tomorrow  = moment(z).add(1,'day').format('dddd, D MMMM YYYY')
    return [today, tomorrow]
}

console.log(currentDate())



