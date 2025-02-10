//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("11/11/1991","TIM","01/01/2020");

        System.out.println(tim.toString());
        System.out.println("Age= "+tim.getAge());
        System.out.println("Pay= "+ tim.collectPay());

        System.out.println("...........................");

        Employee joe = new Employee("10/10/2000","madhur","22/02/2023");
        System.out.println(joe.toString());
        System.out.println("Age= "+joe.getAge());
        System.out.println("Pay= "+ joe.collectPay());
        System.out.println("...........................");

        SalariedEmployee madhur = new SalariedEmployee("10/10/2000","madhur","22/02/2023",100);
        System.out.println(madhur.toString());
        System.out.println(madhur.collectPay());

    }
}