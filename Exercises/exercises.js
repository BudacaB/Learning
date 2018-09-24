class HavingFun {
    wordCounter(sentence, word){
        let result = 0;
        let listificare = sentence.split(' ')
        for (let index = 0 ; index < listificare.length ; index++){
            //let hits = listificare.count(word)
            let parcurgere = listificare[index]
            if (parcurgere === word) {
                result++
            }
        }
        return result
    }
}

module.exports = HavingFun

//Ana are mere mere ana mere
// Ana are mere -> mere - 'mere' count


/*
let a = 'Ana are mere'
let b = a.split(' ')

console.log(b)
*/