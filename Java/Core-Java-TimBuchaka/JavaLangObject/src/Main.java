//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Object{
    public static void main(String[] args) {
        Student s = new Student("MADHUR","NAGRATH");
        System.out.println(s.toString()); //if i dont create tostring in student class then it will call Object class tostring method, by adding @Override in student it overrides tostring method and returns object
        //System.out.println(s);//here it calls the overided method of Student

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy","Shergill","Sushma");
        System.out.println(jimmy);
    }
}