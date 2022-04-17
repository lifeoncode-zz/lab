const sections = document.querySelectorAll('section');

function getProducts(){

    const http = new XMLHttpRequest();

    http.open('GET', 'products.json', true);

    http.onload = function(){
        if(this.status === 200){
            const products = JSON.parse(this.responseText);

            products.forEach(product => {
                buildElement(product);
            })
        }
    }

    http.send();
}




function buildElement(product){
    let prodContainer = document.createElement('div');
    let imgContainer = document.createElement('div');
    let buyContainer = document.createElement('div');    
    
    prodContainer.className = 'product';
    imgContainer.className = 'image';
    buyContainer.className = 'buy';

    buyContainer.innerHTML = `
    <span class="price">${product.price}</span>
    <button>BUY NOW</button>
    `;

    prodContainer.appendChild(imgContainer);
    prodContainer.innerHTML += `
    <h3 class="name">${product.name}</h3>
    <p class="description">${product.description}</p>
    `;
    prodContainer.appendChild(buyContainer);

    sections.forEach(section => {
        if(section.id === product.category){
            section.lastElementChild.appendChild(prodContainer)
        }
    })
}


getProducts()

const person = requre('./products.json');
import './products.json';

console.log(person.name)