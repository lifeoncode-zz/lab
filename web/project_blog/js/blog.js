
const container = document.querySelector('#blogs .blog-grid')

window.addEventListener('DOMContentLoaded', fetchArticles);

// fetch articles from database
function fetchArticles() {
    if (localStorage.getItem('articles')) {
        const articles = JSON.parse(localStorage.getItem('articles'));
        articles.forEach(one => {
            displayBlog(one)
        })

    }else {
        console.log('no data found')
    }
}


function displayBlog(blog) {
    // build ui component
    const blogContainer = document.createElement('div');
    const coverContainer = document.createElement('div');
    const textContainer = document.createElement('div');
    const image = document.createElement('img');
    // assign classes
    blogContainer.className = 'blog';
    coverContainer.className = 'image';
    textContainer.className = 'text';
    image.setAttribute('src', blog.cover);
    // content elements on-the-fly
    // coverContainer.innerHTML = `<img href="${blog.cover}" alt="blog cover image">`;
    
    textContainer.innerHTML += `
    <h3 class="title">${blog.title}</h3>
    <p>${blog.paragraph}</p>
    <a href="#" class="underlined-link">Read more <span></span></a>
    `;
    // append elements
    coverContainer.appendChild(image);
    blogContainer.appendChild(coverContainer);
    blogContainer.appendChild(textContainer);

    // inject to DOM
    container.appendChild(blogContainer)
}
