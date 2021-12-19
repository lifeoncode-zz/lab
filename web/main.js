const form = document.querySelector('form'),
    input = form.querySelector('input'),
    error = document.querySelector('.error'),
    success = document.querySelector('.success');


let magicNum = Math.round(Math.random() * 10 + 1),
    chances = 3;

console.log(magicNum)

form.addEventListener('submit', validate);
function validate(e){
    e.preventDefault();

    if(isNaN(Number(input.value)) || Number(input.value) < 1 || Number(input.value) > 10){
        error.textContent = 'enter a number between 1 and 10';
        setTimeout(() => {
            error.textContent = '';
            input.value = '';
        }, 2000);
        
    }else if(Number(input.value) !== magicNum){
        chances -= 1
        error.textContent = `Wrong, you have ${chances} chances left.`;
        setTimeout(() => {
            error.textContent = '';
            input.value = '';
        }, 2000);
        
    }else{
        success.textContent = 'Correct! you did it.'
        chances = 3;
        setTimeout(() => {
            success.textContent = '';
            input.value = '';
        }, 3000)
    }

    if(chances === 0){
        form.innerHTML = `GAME OVER!<br>number was: ${magicNum}`
    }
}
