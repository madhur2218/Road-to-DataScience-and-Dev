import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Person> p1 = new ArrayList<>();
        p1.add(new Person("madhur", "nagrath"));
        p1.add(new Person("avneet", "sahani"));
        p1.add(new Person("ashu", "singh"));
        


    }

    record Person(String firstName, String lastName){
        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

}