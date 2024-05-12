public class Employee {

    private int id;
    private String name;
    private int salary;

    Employee(){
        id = 123;
        name = "ishant";    //non paremeterized constructor
    }

    Employee(String n, int i){  //parametrised constructor
        this.id = i;
        this.name = n;

    }


    Employee(String n, int i, int salary){  //parametrised constructor
        this.id = i;
        this.name = n;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    private void hello(){
        System.out.println("hi");

    }

}
