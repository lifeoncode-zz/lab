// ES 5 CONSTRUCTORS

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


// inherit prototypes from Person
Client.prototype = Object.create(Person.prototype)

// overide original greet message
Client.prototype.greet = function(message){
    return `${this.name} is saying ${message}`;
}

const m = new Client('Maise', 'Johnson', '44f', '2020');
console.log(j.greet('Hello'))
console.log(m.greet('Hey there'))





// alternative way of protoype inheritencing
const carProtos = {
    info: function(){
        return `${this.model} was built in ${this.year} by ${this.manufacturer}`;
    },
    design: function(){
        return `${this.model} was designed by ${this.designer}`;
    } 
}

const p = Object.create(carProtos, {
    model: {value: 'p1'},
    year: {value: '2013'},
    manufacturer: {value: 'McLaren'},
    designer: {value: 'Frank Stephenson'}
})

console.log(p.info());
console.log(p.design());

console.log(p)