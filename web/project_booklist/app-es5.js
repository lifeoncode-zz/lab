// ES5

// Book constructor
function Book(title, author, isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}


// UI constructor
function UI(){
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

    // add book to list
    ui.addBookToList(book);

    
    
    console.log(book);
    e.preventDefault();
})


document.body.addEventListener('click', function(e){
    if(e.target.classList.contains('delete')){
        document.querySelector('.delete').parentElement.parentElement.remove();
    }
})