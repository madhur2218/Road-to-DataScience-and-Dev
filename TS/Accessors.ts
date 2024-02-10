class Person{

    private firstName: string;
    private secondName: string;

    public set firstname(value:string){
        this.firstName= value;
    }

    public get firstname(): string{
        return this.firstName;
    }

}

let p1= new Person()
p1.firstname = "madhur"
console.log(p1.firstname)