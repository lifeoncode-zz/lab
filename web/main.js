setInterval(() => {
    showTime();
}, 1000)

function showTime(){
    document.body.style.padding = '100px';
    document.body.style.textAlign = 'center';
    document.body.innerHTML = `<h1>${new Date().getHours()}:${new Date().getMinutes()}:${new Date().getSeconds()}</h1>`
}

const user = {
    name: 'Josh',
    surname: 'Mason',
    age: 34
}

for(let item in user){
    console.log(`${item}: ${user[item]}`)
}
