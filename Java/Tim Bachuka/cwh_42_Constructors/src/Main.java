import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Hello world!");

        Employee e1 = new Employee("madhur",12);
        Employee e2 = new Employee("ashutosh", 23);


        Employee e3 = new Employee();
        System.out.println(e3.getName());

//        e1.setId(12);
//        System.out.println(e1.getId());
//        System.out.println(e1.getName());

        System.out.println(e1.getName());
        System.out.println(e1.getId());

        System.out.println(e2.getName());

        System.out.println(e1.getId());
        System.out.println(e2.getId());



        Employee e4 = new Employee("malhar", 123, 10000);
        System.out.println(e4.getSalary());


        //Calling a private method from one class to other class - not in code with harry
        Employee e = new Employee();
        Method m = Employee.class
                .getDeclaredMethod("hello");
        m.setAccessible(true);
        // Using invoke() method
        m.invoke(e);

    }
}