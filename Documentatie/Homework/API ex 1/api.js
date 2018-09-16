// https://data.police.uk/api/forces/leicestershire/people

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