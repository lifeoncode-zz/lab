const form = document.querySelector('form');
const input = form.querySelector('input');
const list = document.querySelector('ul');
const clear = document.querySelector('#clear');
const search = document.querySelector('#search');


search.addEventListener('keyup', searchTask);
function searchTask(e){
    let tasks = list.querySelectorAll('li');
    
    tasks.forEach(function(task){
        let toMatch = search.value.toLowerCase();
        let theTask = task.textContent.toLowerCase();
        if(theTask.indexOf(toMatch) !== -1){
            task.style.display = 'flex';

        }else{
            task.style.display = 'none';
        }
    })
}



form.addEventListener('submit', saveTask);
// save to database
function saveTask(e){
    e.preventDefault();
    const task = input.value;
    if(localStorage.getItem('tasks')){
        let tasks = JSON.parse(localStorage.getItem('tasks'));
        tasks.push(task);
        localStorage.setItem('tasks', JSON.stringify(tasks));
        reload();

    }else{
        const tasks = [];
        tasks.push(task);
        localStorage.setItem('tasks', JSON.stringify(tasks));
        reload();
    }
}


// pull from database to UI
function fetchTasks(){
    if(localStorage.getItem('tasks')){
        let tasks = JSON.parse(localStorage.getItem('tasks'));
        tasks.forEach(task => {
            let li = document.createElement('li');
            let del = document.createElement('i');
            li.textContent = task;
            del.setAttribute('class', 'lni lni-close');
            li.appendChild(del);
            list.appendChild(li);
        })
    }
}
fetchTasks();



// delete individual task
document.body.addEventListener('click', deleteTask);
function deleteTask(e){
    if(e.target.classList.contains('lni')){
        let tasks = JSON.parse(localStorage.getItem('tasks'));
        let toDelete = e.target.parentElement.textContent;
        tasks.forEach(task => {
            if(task === toDelete){
                if(confirm('Are you sure?')){
                    tasks.splice(tasks.indexOf(task), 1);
                    localStorage.setItem('tasks', JSON.stringify(tasks));
                    reload();
                }
            }
        })
    }
}



// delete all tasks
clear.addEventListener('click', deleteAllTasks);
function deleteAllTasks(e){
    if(localStorage.getItem('tasks')){
        if(confirm('All tasks will be deleted, continue?')){
            localStorage.removeItem('tasks');
            reload();
        }
    }
}





// reload tab
function reload(){
    window.location.reload();
}