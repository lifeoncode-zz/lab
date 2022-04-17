

const email = document.querySelector('input')
console.log(email.dataset.ty)

email.addEventListener('keypress', check);

function check(e) {
    if(e.keyCode === 13) {
        validate(email.value);
    }
}

function validate(email) {
    if(email.includes('.') && email.includes('@') && email.length > 5) {
        console.log('valid email');
    }else {
        console.log('invalid email');
    }
}


try {
    const name = "joseph";
    name();
    
} catch (error) {
    console.log('Something went wrong: ',error)
}

console.log('still running')


