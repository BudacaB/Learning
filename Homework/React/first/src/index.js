import React from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';

const App = () => {
    /* let results = new Array(0);
    axios.get('https://api.discogs.com/artists/667', {
        headers: {
            Authorization: 'Discogs key=IrBjXwCYVeyUmsLMuPQh, secret=KWygtxscnYMaGtAELVyJnVPLLtMBNLFQ'
        }
    })
    .then(response => {
        results.push(response);
        console.log(results)
        console.log(results[0].data.realname)
        console.log(results[0].data);
        console.log(JSON.stringify(results[0].data));
    });

    console.log(results)
    let displayResult = results.map(function(result) {
        return JSON.stringify(result.data.name);
    });

    return <div>Artist: {displayResult}</div> */

    
    


    let artistAPI = function () {
        axios.get('https://api.discogs.com/artists/667', {
        headers: {
            Authorization: 'Discogs key=IrBjXwCYVeyUmsLMuPQh, secret=KWygtxscnYMaGtAELVyJnVPLLtMBNLFQ'
        }
    })
    .then(response => {
        document.write(response.data.realname);
        return response;
    })};

    let a = artistAPI();
    console.log(a)
    return <div></div>
    
};

ReactDOM.render(
    <App />,
    document.querySelector('#root')
);