const form = document.querySelector('form');
const amount = form.querySelector('#amount');
const interest = form.querySelector('#interest');
const years = form.querySelector('#years');
const monthlyPay = form.querySelector('#monthly-pay');
const totalPay = form.querySelector('#total-pay');
const totalInterest = form.querySelector('#total-interest');

form.addEventListener('submit', calculate);
function calculate(e){
    e.preventDefault();
}