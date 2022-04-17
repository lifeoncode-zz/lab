// grab elements
const coverImage = document.querySelector('#cover');
const title = document.querySelector('#title');
const paragraph = document.querySelector('#paragraph');
const publishBtn = document.querySelector('#publish-btn');
const publishIcon = document.querySelector('#publish-icon');

// on image selection
coverImage.addEventListener('change', function() {
    const reader = new FileReader();

    reader.addEventListener('load', () => {
            localStorage.setItem('blog-image', reader.result);
    })

    reader.readAsDataURL(this.files[0])
})


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
    if (coverImage.value == '') {
        document.querySelector('label').classList.add('error');
        setTimeout(() => {
            document.querySelector('label').classList.remove('error');
        }, 3000);
        
        return false;

    } else if (title.value == '') {
        title.classList.add('error');
        setTimeout(() => {
            title.classList.remove('error');
        }, 3000);

        return false;

    } else if (paragraph.value == '') {
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
    let blogImage = localStorage.getItem('blog-image');

    const article = {
        cover: blogImage,
        title: title.value,
        paragraph: paragraph.value
    }

    saveToDatabase(article);
    
    setTimeout(() => {
        document.querySelector('#success').classList.add('pulbished');
    }, 1000);
}


// database
function saveToDatabase(article) {

    if (localStorage.getItem('articles') == null) {
        const articles = [article];
        localStorage.setItem('articles', JSON.stringify(articles));

    }else {
        const articles = JSON.parse(localStorage.getItem('articles'));
        articles.push(article);

        localStorage.setItem('articles', JSON.stringify(articles));
    }
}