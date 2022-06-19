const { execSync } = require('child_process');



function login() {
    const output = execSync('lms', { encoding: 'utf-8' });
    console.log(output);
}
