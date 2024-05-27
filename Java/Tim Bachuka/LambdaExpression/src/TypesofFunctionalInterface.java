import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TypesofFunctionalInterface {
    public static void main(String[] args) {
        //Predicate- boolean result
        //Consumer -- modifier data, returns no result
        //Function -- input and output
        //Supplier -- no input only output

        //Predicate
        Predicate<String> checkLength = str -> str.length() >12;
        System.out.println(checkLength.test("helloWORLD"));


        Person p1 = new Person();
        Consumer<Person> setName=(name) -> name.setName("madhur");
        setName.accept(p1);
        System.out.println(p1.getName());

        Function<Integer,String> mult = (i) -> i*10 + "mult";
        System.out.println(mult.apply(2));

        Supplier<Double>getDouble = ()-> Math.random();
        System.out.println(getDouble.get());


    }
}
