// https://data.police.uk/api/forces/leicestershire/people
//Fa o fct care sa cheme linku de mai sus si pt fiecare staff member sa compuna/afiseze un string care zice: (primul console.log/string)Nume: numele lui, rank: rankul lui (al doilea console.log/string) Daca rankul este de chief sa arate chief: true ; daca nu este chief iti arata chief: false (vazut doc despre cautat string in string)

const rp = require("request-promise");


class PoliceApi {
    getListOfForces(link){
        rp.get(link).then(
            function parcurgere(raspuns){
                let raspunsFinal = JSON.parse(raspuns);
                for (let i = 0; i < raspunsFinal.length; i++){
                    let acestObiect = raspunsFinal[i];
                    console.log('name: ' + acestObiect.name + ', ' + 'rank: ' + acestObiect.rank)
                    let thisRank = acestObiect.rank
                    if (thisRank.toLowerCase().includes('deputy')){
                        console.log('deputy: ' + true)
                    } else {
                            console.log('deputy: ' + false)
                        }
                }
            }
        )
    }
}

module.exports = PoliceApi