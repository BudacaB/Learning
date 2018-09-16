const PoliceApi = require('./api.js')

let api = new PoliceApi();

api.getListOfForces('https://data.police.uk/api/forces/leicestershire/people')
