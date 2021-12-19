// ES6 CONSTRUCTORS

class Person{
    constructor(name, surname){
        this.name = name;
        this.surname = surname;
    }

    fullName(){
        return `${this.name} ${this.surname}`
    }

    greet(){
        return `hello there ${this.name}.`
    }
}

// Person.prototype.fullName = function(){
//     return `${this.name} ${this.surname}`
// }
// Person.prototype.greet = function(){
//     return `Hello there ${this.name}.`
// }

const james = new Person('James', 'May');
const jack = new Person('Jack', 'Barker');


console.log(jack)