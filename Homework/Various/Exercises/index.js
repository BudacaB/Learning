/*let myFirstName = 1.25;
let lName = 'Dan';

let name = myFirstName + ',' + lName;

console.log(name)

let result = 5;
result = 6;
console.log(result)*/


/*let myAge = 31;

if (myAge < 30) {
    console.log('My age is ' + myAge)
}
    else {
        console.log('My age is not '+ myAge)
    }*/


   /* let myAge = 31;

if (myAge < 30) {
    console.log('Case1 ' + myAge)
}
else if (
    (10 < myAge)
     && 
     (myAge < 20)
    ){
    console.log('Case2 ' + myAge)
}
else {
    console.log('Case3 ' + myAge)
}*/



/*let myAge = 31;

if (
    !(myAge < 30)
) {
    console.log('Case1 ' + myAge)
}*/


/*let var1 = 5;
let var2 = 8;

//false && true = false
if ((var1 > var2) && (var1 < var2))
    console.log('OK1')

//false || true = true
if ((var1 > var2) || (var1 < var2))
    console.log('OK2')*/

/*let age = 31;

function printAge() {
    console.log(age)
}

printAge()*/

/*let age1 = 31;
let age2 = 32;



function printAge() {
    let result = age1 + age2;
    return result;
}

console.log(printAge())*/





/*
function printAge(age1, age2) {
    let result = age1 + age2;
    return result;
}

console.log(printAge(31, 32))
 
//console.log(printAge(55, 22))

let result = printAge(10, 15);
console.log(result)

console.log(result + 10);
*/



/*
function getMyName(firstName, lastName){
    let fullName = firstName + lastName;
    //console.log(fullName)
    return fullName;    
}

console.log(getMyName('Jean ', 'Valjean'));
*/

/*
let manufacturer = 1;

let masina = {
    year : 1970,
    make : manufacturer
};
console.log(masina)
*/

/*
let om = 'Andrei';
let om2 = {
    name : 'Alecs',
    age : 32
}
console.log(om2.name, om2.age)
*/


/*
let bookshelf = {
    row1 : 'Geography',
    row2 : 'Literature'
}
*/


/*
let om2 = {
    name : 'Alecs',
    age : 32,
    books : {
        row1 : 'Geography',
        row2 : {
            book1 : "Faust",
            book2 : "Gog"
        }
    }
}

console.log(om2)
*/




/*
let om2 = {
    name : 'Alecs',
    age : 32,
    books : {
        row1 : 'Geography',
        row2 : {
            book1 : "Faust",
            book2 : "Gog"
        }
    }
}
*/



/*
function showAgeOfPerson(person) {
    if (person.age === 32) console.log(person.name)
}

/*
let om2 = {
    name : 'Alecs',
    age : 32
}


showAgeOfPerson({
    name : 'Alecs',
    age : 32
}  
)
*/

/*
let numar1 = 5;
let numar2 = 7;

let om = {
    age : 32,
    name : 'Alecs',
    cars : ['bmw', 'opel', 'mazda']
}

console.log(om)


let sir = [1, 2, 3];
console.log(sir)
sir.push(4)
console.log(sir)
sir.unshift(0)
console.log(sir)

let sir2 = [4, 5, 6];

let both = sir.concat(sir2)
console.log(both)
console.log(typeof(both))
*/
//console.log(sir.join)



//sir.slice(start)



//console.log(typeof(sir))




/*
let stire = {
    titlu: 'Sport astazi'
};

let stire2 = {
    titlu: 'Vremea astazi'
};

let stire3 = {
    titlu: 'Monden'
};
*/
/*
let lista = [stire, stire2];
console.log('lista'.startsWith('lis'));
*/

/*
let listaStiri = [stire, stire2, stire3];

function afisare(lista){
    for (i = lista.length - 1; i >= 0; i--){
        console.log(lista[i]);
    }
}

afisare(listaStiri);
*/


/*
let stire = {
    titlu: 'Sport astazi',
    numar: '20'
};

console.log(parseInt(stire.numar) + 10)
*/

/*
let stire = {
    titlu: 'Sport astazi'
};

let stire2 = {
    titlu: 'Vremea astazi'
};

let lista = [stire, stire2];
*/


// let i = 0;

/*
while (i < lista.length){
    i = i + 1    // i++
    console.log(lista[i])
    console.log(i)
}
*/

/*
while (i < lista.length){    
    console.log(lista[i]);
    i = i + 1;
    break
}
*/




/*
function afiseazaElement(param) {
    console.log(param)
}
*/

// Trimitem functia ca si parametru, fara '()'
//lista.forEach(afiseazaElement)

/*
lista.forEach(
    function afiseazaElement(param) {
        console.log(param)
    }
)

afiseazaElement()
*/



/*
const PoliceApi = require('./api.js')

let api = new PoliceApi();

api.getSpecificForce('https://data.police.uk/api/forces/leicestershire')
*/


/*
const HavingFun = require('./exercises.js')

let newObj = new HavingFun();

let rezultatFinal = newObj.wordCounter('Ana are mere si mere', 'Ana')
console.log(rezultatFinal)

let rezultatFinal2 = newObj.wordCounter('Ana are mere si mere mere mere', 'Ana')
console.log(rezultatFinal2)
*/