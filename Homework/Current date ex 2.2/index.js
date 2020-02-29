// Modifica functia care arata data curenta sa afiseze in formatul: 
// "Tuesday, 15 October 2018"
// Try also with moment.js - npm install

/*
const currentDate = () => {
    console.log(Date())
}

currentDate()
*/

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