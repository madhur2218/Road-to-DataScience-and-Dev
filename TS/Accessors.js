"use strict";
class Person {
    set firstname(value) {
        this.firstName = value;
    }
    get firstname() {
        return this.firstName;
    }
}
let p1 = new Person();
p1.firstname = "madhur";
console.log(p1.firstname);
