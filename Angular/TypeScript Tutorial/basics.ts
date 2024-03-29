let age1 : number;
let userName : string;
let isInstructor : boolean;

let hobbies : string []
let rollNumbers : number[]

let person1 : {
    name: string,
    rollno: number;
};


person = {
    name:  'madhur',
    age : 23
};


let color1 : {
    price: number,
    rent : boolean
}[];

 //Type Inference 

 let course = 'Python boothcamp';
//  course = 132431;   // here we will get error bcoz of ts inference 


//Here we are defining a FUNCTION TYPE
function subtraction(a:number, b :number ) : number{
    return a-b;
}


//Classes

class Student{
    fName: string;
    lname: string;
    age : number;
    courses :string [];

    constructor(fname: string, lname: string, age:number, courses:string[]){

        this.fName = fname;
        this.lname = lname;
        this.age = age;
        this.courses = courses;
    }

    enroll(courseName: string){
        this.courses.push(courseName);
    }

}

let student = new Student('Madhur', 'Nagrath', 123, ['Angular'])

student.enroll("react")








