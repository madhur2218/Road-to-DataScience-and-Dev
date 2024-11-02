
public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim","11/11/1995","01/01/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","03/03/2020",35000);
        System.out.println(joe);
    }
}