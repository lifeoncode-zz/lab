const form = document.querySelector('form');
const input = form.querySelector('input');
const list = document.querySelector('ul');
const clear = document.querySelector('#clear');



form.addEventListener('submit', function(e){
    e.preventDefault();

    let li = document.createElement('li');
    let remove = document.createElement('i')
    li.textContent = input.value;
    remove.setAttribute('class', 'lni lni-close');
    remove.addEventListener('click', function(e){
        let item = this.parentElement.parentElement;
        this.parentElement.remove(item);
    })
    
    input.value = null;
    li.appendChild(remove);
    list.appendChild(li);
})


clear.addEventListener('click', function(e) {
    let items = list.children;
    list.innerHTML = '';
})


let label = form.firstElementChild;
let newLabel = document.createElement('h3');
newLabel.appendChild(document.createTextNode('New Task'));
form.replaceChild(newLabel, label)

setTimeout(() => {
    form.removeChild(newLabel)
}, 5000);

