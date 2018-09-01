//https://data.police.uk/api/forces

//https://data.police.uk/api/forces/leicestershire

const rp = require("request-promise");


class PoliceApi {
    getListOfForces(link){
        rp.get(link).then(
            function parcurgere(raspuns){
                let raspunsFinal = JSON.parse(raspuns);
                console.log(raspuns);
                for (let i = 0; i < raspunsFinal.length; i++){
                    //console.log(raspuns.name)
                    let acestObiect = raspunsFinal[i];
                    console.log(acestObiect.name)
                }
            }
        )

    }



    getSpecificForce(link){
        rp.get(link).then(
            function parcurgere(raspuns){
                let raspunsFinal = JSON.parse(raspuns);
                let arrayulMeu = raspunsFinal['engagement_methods'];
                for (let i = 0; i < arrayulMeu.length; i++){
                    let acestObiect = arrayulMeu[i];
                    console.log(acestObiect.url)
                }
            }
        )

    }


}

//Api.makeWebCall('https://data.police.uk/api/forces')

module.exports = PoliceApi






