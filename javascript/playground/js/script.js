const btn = document.querySelector('#get-text');
const btn2 = document.querySelector('#get-json');
const btn3 = document.querySelector('#get-api');
const output = document.querySelector('#output');

btn.addEventListener('click', getText);
btn2.addEventListener('click', getJson);
btn3.addEventListener('click', getApi);


function getText(e) {
    fetch('file.txt')
    .then((response) => {
        return response.text();
    })
    .then((data) => {
        output.textContent = data;
    })
}


function getJson(e) {
    fetch('customers.json')
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
        let content = '';
        data.forEach(item => {
            content += `<p>${item.id}: ${item.name}</p>`;
            output.innerHTML = content;
        })
    })
}


function getApi(e) {
    fetch('https://admin.linavton.co.za/retrieve')
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        console.log(data);
        let content = '';
        data.forEach(item => {
            content += `<p>${item.id}: ${item.name}</p>`;
            output.innerHTML = content;
        })
    })
}