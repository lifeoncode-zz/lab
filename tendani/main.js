const form = document.querySelector('form')
const input = document.querySelector('#image-upload')

form.addEventListener('submit', upload)

function upload(e){
    e.preventDefault();
    let content = input.value;
    localStorage.setItem('content', JSON.stringify(content))
}