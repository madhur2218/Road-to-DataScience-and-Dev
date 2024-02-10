class Customer1{
    private firstName: string ;
    private lastName: string;
    private age : number;

    public setFirstName(theFirst:string): void{
        this.firstName= theFirst;
        
    }

    public getFirstName():string{
        return this.firstName;
    }



    // constructor(first: string, last:string, age: number){
    //     this.firstName=first;
    //     this.lastName= last;
    //     this.age= age;
    // }
}

let obj1= new Customer1();
obj1.setFirstName("madhur");
console.log(obj1.getFirstName())