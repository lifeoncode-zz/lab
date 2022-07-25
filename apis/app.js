const btn = document.querySelector('#btn');
btn.addEventListener('click', getData);


function getData() {
    const xhr = new XMLHttpRequest();

    xhr.open('GET', 'data.json', true);
    xhr.onload = function() {
        if (this.status === 200) {
            let response = JSON.parse(this.responseText);
            document.querySelector('.output').textContent = response.email;
        } else {
            document.querySelector('.output').textContent = "not found";
        }
    }

    xhr.send();
    
}