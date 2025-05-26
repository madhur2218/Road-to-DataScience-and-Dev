public class Student {
    private String name;
    private String lastName;

    public Student(String name, String lastName){
        this.name= name;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return  "Name is: "+ name + " "+ lastName;
    }

//    @Override
//    public String toString() {
//        return super.toString();  //this is just a redundant method
//    }
}
