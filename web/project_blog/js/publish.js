// grab elements
const title = document.querySelector('#title');
const paragraph = document.querySelector('#paragraph');
const publishBtn = document.querySelector('#publish-btn');
const publishIcon = document.querySelector('#publish-icon');

// on publish click
publishBtn.addEventListener('click', publishArticle);
publishIcon.addEventListener('click', publishArticle);

// publish article
function publishArticle(e) {
    if (validContent()) {
        buildArticle();
    }
}


// validate content
function validContent() {
    if (title.value == '') {
        title.classList.add('error');
        setTimeout(() => {
            title.classList.remove('error');
        }, 3000);

        return false;

    }else if (paragraph.value == '') {
        paragraph.classList.add('error');
        setTimeout(() => {
            paragraph.classList.remove('error');
        }, 3000);

        return false;

    }else {
        return true;
    }
}


// build article to send to database
function buildArticle() {
    const article = {
        title: title.value,
        paragraph: paragraph.value
    }

    saveToDatabase(article);
}


// database
function saveToDatabase(article) {

    if (localStorage.getItem('articles') == null) {
        const articles = [article];
        localStorage.setItem('articles', JSON.stringify(articles));
        console.log('Article published..');

    }else {
        const articles = JSON.parse(localStorage.getItem('articles'));
        articles.push(article);

        localStorage.setItem('articles', JSON.stringify(articles));
        console.log('new article added')
    }
}