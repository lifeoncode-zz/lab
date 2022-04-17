
window.onclick = function() {console.log('window clicked')}
document.body.onclick = function() {console.log('body clicked')}
document.querySelector('.container').onclick = function() {console.log('container clicked')}

document.querySelector('button').addEventListener('click', function(e) {
    e.stopPropagation();
    console.log('button clicked')
})


window.addEventListener('contextmenu', function(e) {
    e.preventDefault()
    console.log('nah man...')
})