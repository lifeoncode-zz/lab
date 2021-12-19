// ES5

// Book constructor
function Book(title, author, isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}


// UI constructor
function UI(){
    // add book proto
    UI.prototype.addBookToList = function(book){
        const list = document.querySelector('#book-list');
        // create elements
        const row = document.createElement('tr');
        row.innerHTML = `
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.isbn}</td>
        <td><a href="#" class="delete">X</a></td>
        `
        list.appendChild(row);
    }

    // clear fields proto
    UI.prototype.clearFields = function(){
        document.querySelectorAll('input[type="text"]').forEach(function(input){
            input.value = '';
        })
    }
}

// event listener on form
document.querySelector('#book-form').addEventListener('submit', function(e){
    // grab all elements required
    const title = document.querySelector('#title').value,
        author = document.querySelector('#author').value,
        isbn = document.querySelector('#isbn').value;

    // instantiate a new book
    const book = new Book(title, author, isbn);

    // instantiate a new book in UI
    const ui = new UI();

    // validate before adding book
    if(title === '' || author === '' || isbn === ''){
        let error = document.createElement('div');
        error.className = 'error';
        error.textContent = 'Enter all fields'
        document.querySelector('.container').insertBefore(error, document.querySelector('#book-form'));

        // hide error
        setTimeout(() => {
            document.querySelector('.error').remove();
        }, 3000);

    }else{

        // add book to list
        ui.addBookToList(book);
    
        // clear input fields after adding book
        ui.clearFields(document.querySelector('#book-form'));
    
        let success = document.createElement('div');
        success.className = 'success';
        success.textContent = 'Book added'
        document.querySelector('.container').insertBefore(success, document.querySelector('#book-form'));

        // hide error
        setTimeout(() => {
            document.querySelector('.success').remove();
        }, 3000);
    }

    e.preventDefault();
})


document.body.addEventListener('click', function(e){
    if(e.target.classList.contains('delete')){
        document.querySelector('.delete').parentElement.parentElement.remove();
    }
})