public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeenno = 1;

    public Employee(){

    }
    public Employee(String birthDate, String name, String hireDate) {
        super(birthDate, name);
        this.employeeId = Employee.employeenno++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}
