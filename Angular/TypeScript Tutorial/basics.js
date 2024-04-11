var age1;
var userName;
var isInstructor;
var hobbies;
var rollNumbers;
var person1;
person = {
    name: 'madhur',
    age: 23
};
var color1;
//Type Inference 
var course = 'Python boothcamp';
//  course = 132431;   // here we will get error bcoz of ts inference 
//Here we are defining a FUNCTION TYPE
function subtraction(a, b) {
    return a - b;
}
//Classes
var Student = /** @class */ (function () {
    function Student(fname, lname, age, courses) {
        this.fName = fname;
        this.lname = lname;
        this.age = age;
        this.courses = courses;
    }
    Student.prototype.enroll = function (courseName) {
        this.courses.push(courseName);
    };
    return Student;
}());
var student = new Student('Madhur', 'Nagrath', 123, ['Angular']);
student.enroll("react");
