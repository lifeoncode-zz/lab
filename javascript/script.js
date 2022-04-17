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

// inherit
class Client extends Person{
    constructor(name, surname, membership, email){
        super(name, surname)
        this.membership = membership;
        this.email = email;
    }

    thankClient(){
        let currentYear = new Date().getFullYear();
        return `Hey ${this.name}, it has been ${currentYear - this.membership} years on your membership with us. Thank you for your support!`;
    }
}


const james = new Person('James', 'May');
const jack = new Client('Jack', 'Barker', 2008, 'jack@hotmail.co.uk');


console.log(james);
console.log(jack.thankClient());
