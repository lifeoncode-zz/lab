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
        console.log('good to go');
    }else {
        console.log('not good');
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