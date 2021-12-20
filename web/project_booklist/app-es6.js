// ES6 CONSTRUCTOR METHOD

// book class
class Book{
    constructor(title, author, isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}


// ui class
class UI{
    // add book to ui list
    addBookToList(book){
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
    
    // show elert messages
    showAlert(message, className){
        let div = document.createElement('div');
        div.className = `alert ${className}`;
        div.appendChild(document.createTextNode(message));
        document.querySelector('.container').insertBefore(div, document.querySelector('#book-form'));

        // remove alert after 3 sec
        setTimeout(() => {
            document.querySelector('.alert').remove();
        }, 3000)
    }

    // delete book from ui list
    deleteBook(target){
        target.parentElement.parentElement.remove();
        // delete from DB
        let toDelete = target.parentElement.parentElement.lastElementChild.previousElementSibling.textContent;
        Store.removeBook(toDelete);
    }

    // clear all input fields
    clearFields(){
        document.querySelectorAll('input[type="text"]').forEach(input => {
            input.value = '';
        })
    }
}


// save to database
class Store{
    static getBooks(){
        let books;
        if(localStorage.getItem('books')){
            books = JSON.parse(localStorage.getItem('books'));
        }else{
            books = [];
        }

        return books;
    }
    
    static displayBooks(){
        if(localStorage.getItem('books')){
            let books = JSON.parse(localStorage.getItem('books'));
            const ui = new UI()
            books.forEach(book => {
                ui.addBookToList(book)
            });
        }
    }

    static addBook(book){
        const books = this.getBooks();
        books.push(book);
        localStorage.setItem('books', JSON.stringify(books));
    }
    
    static removeBook(target){
        if(localStorage.getItem('books')){
            let books = JSON.parse(localStorage.getItem('books'));
            books.forEach(book => {
                if(book.isbn === target){
                    books.splice(books.indexOf(book), 1);
                    localStorage.setItem('books', JSON.stringify(books));
                }
            })
        }
    }
}

Store.displayBooks()

// event on form submit
document.querySelector('#book-form').addEventListener('submit', function(e){
    // grab all elements required
    const title = document.querySelector('#title').value,
        author = document.querySelector('#author').value,
        isbn = document.querySelector('#isbn').value;

    // instantiate a new book
    const book = new Book(title, author, isbn);

    // instantiate UI
    const ui = new UI();

    if(title === '' || author === '' || isbn === ''){
        ui.showAlert('Fill in all fields.', 'error');

    }else{
        // add book to list
        ui.addBookToList(book);
        // save to database
        Store.addBook(book);

        // show alert
        ui.showAlert('Book added', 'success');
        // clear input fields after adding book
        ui.clearFields();
    }

    e.preventDefault();
})


// delete book
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