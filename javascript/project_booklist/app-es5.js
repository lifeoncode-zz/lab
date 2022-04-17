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

    // show alerts proto
    UI.prototype.showAlert = function(message, className){
        let div = document.createElement('div');
        div.className = `alert ${className}`;
        div.appendChild(document.createTextNode(message));
        document.querySelector('.container').insertBefore(div, document.querySelector('#book-form'));

        // hide error
        setTimeout(function() {
            document.querySelector('.alert').remove();
        }, 3000);
    }

    // delete book proto
    UI.prototype.deleteBook = function(target){
        if(target.classList.contains('delete')){
            target.parentElement.parentElement.remove();
        }
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

    // instantiate UI
    const ui = new UI();

    // validate before adding book
    if(title === '' || author === '' || isbn === ''){
        ui.showAlert('Fill in all fields.', 'error');

    }else{
        // add book to list
        ui.addBookToList(book);
        // show alert
        ui.showAlert('Book added', 'success');
        // clear input fields after adding book
        ui.clearFields(document.querySelector('#book-form'));
    }

    e.preventDefault();
})


document.querySelector('#book-list').addEventListener('click', function(e){
    if(e.target.classList.contains('delete')){
        // instantiate ui
        const ui = new UI();
        // delete book from list
        ui.deleteBook(e.target);
        // show alert message
        ui.showAlert('Book deleted', 'success');
        
        e.preventDefault();
    }
})