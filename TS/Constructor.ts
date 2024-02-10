class Customer3{
    public setFirstName(theFirst:string): void{
        this.firstName= theFirst;
        
    }

    public getFirstName():string{
        return this.firstName;
    }



    constructor(private firstName1:, private lastName: string, private age :  number){

    }
}

let obj1= new Customer1();
obj1.setFirstName("madhur");
console.log(obj1.getFirstName())