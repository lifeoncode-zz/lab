const btn1 = document.querySelector('#btn1'),
    btn2 = document.querySelector('#btn2');

btn1.addEventListener('click', loadCustomer);

function loadCustomer(){
    const xhr = new XMLHttpRequest;
    xhr.open('get', 'customer.json', true);

    xhr.onload = function(){
        if(this.status === 200){
            const customer = JSON.parse(this.responseText);
            document.querySelector('#customer').innerHTML = `
            <ul>
                <li><strong>ID:</strong> ${customer.id}</li>
                <li><strong>Name:</strong> ${customer.name}</li>
                <li><strong>Company:</strong> ${customer.company}</li>
                <li><strong>Email:</strong> ${customer.email}</li>
                <li><strong>Phone:</strong> ${customer.phone}</li>
            </ul>
            `;
        }
    }
    
    xhr.send();
}


btn2.addEventListener('click', loadCustomers);

function loadCustomers(){
    const xhr = new XMLHttpRequest;
    xhr.open('get', 'customers.json', true);

    xhr.onload = function(){
        if(this.status === 200){
            const customers = JSON.parse(this.responseText);
            customers.forEach(customer => {
                document.querySelector('#customers').innerHTML += `
                <ul style="border:1px solid black; padding: 10px; border-radius:5px;">
                    <li><strong>ID:</strong> ${customer.id}</li>
                    <li><strong>Name:</strong> ${customer.name}</li>
                    <li><strong>Company:</strong> ${customer.company}</li>
                    <li><strong>Email:</strong> ${customer.email}</li>
                    <li><strong>Phone:</strong> ${customer.phone}</li>
                </ul>
                `;
            })
            
            console.log(this.responseText);
        }
    }
    
    xhr.send();
}