// const btn = document.querySelector('.talk');
// const content = document.querySelector('.content');

// // try{

//     const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
//     const recognition = new SpeechRecognition();

//     recognition.onstart = function() {
//         console.log("voice activated, you can talk");
//     };

//     recognition.onresult = function(event) {
//         const current = event.resultIndex;
//         const transcript = event.results[current][0].transcript;
//         content.textContent = transcript;
//     };

// // }catch (error){
// //     console.log('something went wrong: '+error);
// // }


// btn.addEventListener('click', function(e) {
//     recognition.start();
// })


class User {
    constructor(username, password) {
        this.username = username;
        this.password = password;
    }

    getUsername = function() {
        return this.username;
    }

    getPassword = function() {
        return this.password;
    }

    userInfo = function() {
        return `${this.username}'s password is ${this.password}`;
    }
}


var jake = new User("jake", "12345")

console.log(jake.userInfo())