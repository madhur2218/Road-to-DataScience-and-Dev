class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Main {
    public static void main(String[] args) {
        //Problem1

        Employee e1= new Employee();
        Employee e2= new Employee();

         e1.setName("madhur");
         e1.setSalary(23);

        e2.setName("ashu");
        e2.setSalary(33);

        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        System.out.println(e2.getName());
        System.out.println(e2.getSalary());

       // System.out.println(Employee.salary);


        //Problem2
        CellPhone c1= new CellPhone();
        c1.ringing();
        c1.vibrating();

        //Problem 3
        Square s1= new Square();
        s1.side=4;
        System.out.println(s1.area());
        System.out.println(s1.perimeter(2));
    }
}