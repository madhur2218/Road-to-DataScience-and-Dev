//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Calling static method without an object
        int sum = Calculator.add(5, 10);
        System.out.println("Sum: " + sum);

        // Using instance method
        Calculator calc = new Calculator();
        calc.setInstanceVar(20);
        System.out.println("Instance Variable: " + calc.instanceVar);
    }
}