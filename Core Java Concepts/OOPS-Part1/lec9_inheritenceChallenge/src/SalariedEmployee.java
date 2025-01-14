public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String birthDate, String name, String hireDate, double annualSalary) {
        super(birthDate, name, hireDate);
        this.annualSalary = annualSalary;

    }

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public SalariedEmployee(String birthDate, String name, String hireDate, double annualSalary, boolean isRetired) {
        super(birthDate, name, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay(){
        return annualSalary/26;
    }

    public void retire(){
        terminate("22/10/2025");
        isRetired=true;
    }
}
