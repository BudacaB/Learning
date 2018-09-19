




//Exercitiul 1
//Faci o fct care sa returneze un obj JSON care sa spuna nume, varsta; si calculatorul sa fie un sub-obiect care sa spuna ce CPU si cat RAM are.
/*
let om = {
    name : 'Bogdan',
    age : 31,
    comp : {
        cpu : 'intel',
        ram : '12GB'
    }
}

function showPerson (person) {
    return(person)
}

console.log(showPerson(om))
*/


//Exercitiul 2
// O fct care sa primeasca ca param 2 array-uri si sa returneze un singur array care sa le concateneze - sa afiseze fct exact ce am trimis ca param intr-un singur array
	//E.g. myFunction( [1, 2], [3, 4] )
/*
function lipire (firstArray, secondArray){
    let fullSir = firstArray + ',' + secondArray;
    return fullSir;
}

console.log(lipire([1, 2, 3], [4, 5, 6]))
*/

/*
function lipire (firstArray, secondArray){
    let fullSir = firstArray.concat(secondArray);
    return fullSir;
}

console.log(lipire([1, 2, 3], [4, 5, 6]))
*/


//Exercitiul 3
// O fct care primeste ca parametru un array ce contine doua obiecte JSON, si sa intoarca proprietatea name din primul obj + proprietatea name din al doilea obiect, concatenate: 
// E.g. myFunction( [{name: A}, {name: B}] )  -> functia sa intoarca stringul: “AB”


/*
let a = {
    name: 'Bogdan'
};

let b = {
    name: 'Budaca'
};

function lipire (firstObiect, secondObiect){
    let fullSir = firstObiect.concat(secondObiect);
    return fullSir;
}

console.log(lipire([{name: a}, {name: b}]))
*/

/*
let a = {
    name: 'Bogdan'
};

let b = {
    name: 'Budaca'
};

function lipire (){
    let fullSir = a.name+b.name;
    return fullSir;
}

console.log(lipire([{name: a}, {name: b}]))
*/



/*
let a = {
    name: 'A'
}

let b = {
    name: 'B'
}

let c = [a.name, b.name]

console.log(c[0]+c[1])
*/

/*
function lipire() {
    let a = {name: 'A'};
    let b = {name: 'B'};
    let c = [a.name, b.name];
    let d = [c[0] + c[1]];
    return d
}

console.log(lipire([{name: 'Bog'}, {name: 'dan'}]))
*/

/*
function lipire (){
    let a = 
    return ;
}

console.log(lipire([{name: 'Bog'}, {name: 'dan'}]))
*/

/*
function lipire(a, b) {
    return a.name + b.name
}

console.log(lipire({name: 'Bog'}, {name: 'dan'}))
*/

/*
function lipire(a) { 
    return a[0].name + a[1].name 
}

console.log(lipire([{name: 'Bog'}, {name: 'dan'}]))
*/


// Exercitiul 4
// O functie care sa primeasca un string ca parametru, si sa intoarca un array unde fiecare litera din stringu ala, e un element in array. Exemplu makeArray(“Andrei”) -> trb sa intoarca functia: [A, n, d, r, e, i]

// Raw - return string elements in array format
// Issues - using the knowledge of string length beforehand - not reusable
//        - output returns string elements in array elements but with quotes
//        - output also throws undefined at the end
/*
function makeArray (a){
    return [a[0], a[1], a[2], a[3], a[4], a[5], a[6]]
}

console.log(makeArray('Andrei'))
*/

/*
function makeArray (a){
    for (i = 0; i < a.length + 1; i++){
        a = a + i;
    }
    return
}
*/

/*
let a = 'Andrei';
let b = a.split('');
console.log(b[3])
*/

/*
function makeArray (a){
    let b = a.split('');
    for (i = 0; i < a.length; i++){
        b = b + i;
    }
    return [b]
}

console.log(makeArray('Andrei'))
*/

/*
function makeArray (a){
    let b = a.split('');
    for (i = 0; i < a.length; i++){
        b = b + b[i];
    }
    return [b]
}

console.log(makeArray('Andrei'))
*/

/*
let a = 'Andrei';
let b = a.split('');
console.log(b)
*/

/*
function makeArray (a){
    let b = a.split('');
    return b
}

console.log(makeArray('Andrei'))
*/

/*
function makeArray (a){
    let b = a.split('');
    return b
}

console.log(makeArray('Andrei'))
*/


function makeArray (a){
    let b = a.split('');
    console.log(b.length)
    return [b]
}

let c = makeArray('Andrei')
console.log(c);
console.log(c.length);
console.log(typeof(c))







