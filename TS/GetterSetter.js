"use strict";
class Customer1 {
    setFirstName(theFirst) {
        this.firstName = theFirst;
    }
    getFirstName() {
        return this.firstName;
    }
}
let obj1 = new Customer1();
obj1.setFirstName("madhur");
console.log(obj1.getFirstName());
