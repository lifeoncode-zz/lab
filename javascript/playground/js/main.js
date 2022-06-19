
let output = 'default';

function build(string, callback) {
    setTimeout(() => {
        output = string;
        callback();
    }, 3000);
}


function show() {
    console.log(output);
}

build("hello there", show);
