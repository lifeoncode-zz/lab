const btns = document.querySelectorAll('button'),
    input = document.querySelector('input'),
    ans = document.querySelector('#answer');


btns.forEach(btn => {
    btn.addEventListener('click', (e) => {
        if(btn.id !== 'equals'){
            input.value += btn.textContent;
        }
    })
})