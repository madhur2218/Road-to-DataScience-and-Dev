public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        //this.isRetired = isRetired;
    }


    public double collectPay(){
        return annualSalary/26;
    }


    public void retire(){
        terminate("12/12/2025");
        isRetired=true;
    }
}
