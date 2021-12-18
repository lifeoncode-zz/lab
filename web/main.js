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
    input.value = null;
    li.appendChild(remove);
    list.appendChild(li);
})


clear.addEventListener('click', function(e) {
    let items = list.children;
    for(let x = 0; x <= items.length; x++){
        console.log(items[x])
    }
})

document.body.addEventListener('click', remove);


function remove(e){
    if(e.target.classList.contains('lni')){
        let del = e.target;
        let item = del.parentElement;
        list.removeChild(item);
        
    }else{
        console.log('clicked on body')
    }
}
