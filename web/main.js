

function Person(name, surname){
    this.name = name;
    this.surname = surname;
}

Person.prototype.greet = function(message){
    return `${this.name} says "${message}"`;
}

const j = new Person('Jeremy', 'Clarkson');
const b = new Person('Blake', 'Lewis');

function Client(name, surname, id, membership){
    // inherit from Person constructor
    Person.call(this, name, surname);
    
    this.id = id;
    this.membership = membership;
}

Client.prototype.info = function(){
    return `${this.name} has been a member since ${this.membership}`
}

const m = new Client('Maise', 'Johnson', '44f', '2020');
console.log(j.greet('Hello'))
console.log(m.info())

