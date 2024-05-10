class Employee{
    int salary;
    String name;

    public void printDetails(){
        System.out.println(salary + "" + name);
    }

    public int getSalary(){
        return salary;

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("This is our custom class!");
        Employee e1= new Employee();
        Employee e2 = new Employee();

        //Setting attributes
        e1.salary=12;
        e1.name="madhur";

        e2.salary=50;
        e2.name="ashu";

        //Printing attributes
        System.out.println(e1.salary + " " + e1.name);
        e1.printDetails();

        e2.printDetails();

        int res1= e1.getSalary();
        int res2 = e2.getSalary();

        System.out.println(res1 + " " + res2);




    }
}