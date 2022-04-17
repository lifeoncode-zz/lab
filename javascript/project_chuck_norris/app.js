
const form = document.querySelector('form'),
    jokesInput = document.querySelector('#number'),
    output = document.querySelector('#jokes-output');

// when get jokes button clicks
form.addEventListener('submit', getJokes);
// get the jokes from API
function getJokes(e){
    e.preventDefault();
    // first make sure input field for number of jokes is not empty and whats in there is a real Number
    if(jokesInput.value === '' || isNaN(jokesInput.value)){
        alert('Enter number of jokes to generate');

    }else{
        // request
        const xhr = new XMLHttpRequest();
        xhr.open('get', `http://api.icndb.com/jokes/random/${Number(jokesInput.value)}`, true);

        xhr.onload = function(){
            if(this.status === 200){
                const response = JSON.parse(this.responseText);

                if(response.type === 'success'){
                    const jokes = response.value;
                    jokes.forEach(joke => {
                        output.innerHTML += `
                        <ul>
                            <li>${joke.joke}</li>
                        </ul>
                        `;
                    })

                }else{
                    output.innerHTML = '<span>Something went wrong</span>';
                }
            }
        }
        
        xhr.send();
    }
}