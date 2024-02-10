class Customer{
    firstName: string ;
    lastName: string;
    age : number= 23;

    constructor(first: string, last:string, age: number){
        this.firstName=first;
        this.lastName= last;
        this.age= age;
    }
}

let c1= new Customer("madhur", "nagrath", 12);
console.log(c1.age);

