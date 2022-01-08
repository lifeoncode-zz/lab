// const display = document.querySelector('#display');
const buttons = document.querySelectorAll('.button');

buttons.forEach(btn => {
    btn.addEventListener('click', (e) => {
        switch(btn.textContent){
            case '=':   try{
                            display.textContent = eval(display.textContent);
                        }catch{
                            display.textContent = 'Invalid expression!';
                        }
                break;
            
            case 'c':   display.textContent = '';
                break;

            case '←':   display.textContent = display.textContent.slice(0, -1);
                break;

            default:    display.textContent += btn.textContent;
                break;
        }
    })

})

