let users = [];

console.log("Parek");

class User {
    constructor(firstname, lastname, email, age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    toString() {
        return `Name: ${this.firstname} ${this.lastname}, Age: ${this.age}, Email ${this.email}`;
    }
}

function addUser() {
    event.preventDefault();
    let firstname = document.getElementById('firstName').value;
    let lastname = document.getElementById('lastName').value;
    let email = document.getElementById('email').value;
    let age = document.getElementById('age').value;

    users.push(new User(firstname, lastname, email, age));
    console.log(users.at(users.length-1));
}