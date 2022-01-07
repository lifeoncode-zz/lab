
// few things to keep in mind

// READY STATE VALUES
// 0: request not initialized
// 1: server connection established
// 2: request received
// 3: processing request
// 4: request finished and response is ready

// HTTP STATUSES
// 200: "ok"
// 403: "forbidden"
// 404: "not found"




const btn = document.querySelector('button');
btn.addEventListener('click', loadData);

function loadData(e){
    // create XHR Object
    const xhr = new XMLHttpRequest();

    // open
    xhr.open('GET', 'data.txt', true);

    // while loading
    xhr.onprogress = function(){
        document.querySelector('.container').innerHTML = `
        <h1>Loading...</h1>
        `
    }


    xhr.onload = function(){
        document.querySelector('.container').innerHTML = `
        <button type="button">get data</button>
        `
        
        // check net status
        if(this.status === 200){
            console.log(this.responseText);
            
        }else if(this.status === 404){
            document.querySelector('.container').innerHTML = `
            <h1>Oops!</h1>
            <p>Looks like we couldn't find what you're looking for.</p>
            <a href="./index.html">Okay</a>
            `
        }
    }

    // send
    xhr.send();
}