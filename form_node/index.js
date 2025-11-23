let users = [];

function pridejUser() {
    let firstname = document.getElementById("firstName").value;
    let lastname = document.getElementById("lastName").value;
    let email = document.getElementById("email").value;
    let age = document.getElementById("age").value;
    let output = document.getElementById("output");

    if (!firstname || !lastname || !email || !age) {
        output.innerHTML = "neco je prazdne, prosim vyplnte to";
        return;
    }

    for (let user of users) {
        if (user.email === email) {
            output.innerHTML = "email je jiz pouzity, zkuste jiny";
            return;
        }
    }

    users.push(new User(firstname, lastname, email, age));
    console.log(users.at(users.length-1));
}

function prectiUsers(){
    let seznam = "";
    let vysledek = document.getElementById("vysledek");
    for(let user of users){
        console.log(user.toString());
        seznam += user.toString() + "<br>";
    }
    vysledek.innerHTML = seznam;
}

function odstranUser(){
    let deletEmail = document.getElementById("deleteEmail").value;
    
    for(let user of users){
        if(user.email === deletEmail){
            users.splice(users.indexOf(user), 1);
            console.log("Byl odstranen, zbytek: ");
            prectiUsers();
            return;
        }
    }
    console.log("tenhle email neni v zapsany")
}

class User {
    constructor(firstname, lastname, email, age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    toString() {
        return `Name: ${this.firstname} ${this.lastname}, Age: ${this.age}, E-mail: ${this.email}`;
    }
}