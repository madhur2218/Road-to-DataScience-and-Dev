import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDB {

    public static List<Customer> getAll(){

        return Stream.of(
                new Customer(101,"madhur", "madhurnagrath@gmail.com", Arrays.asList("123","123")),
                new Customer(102,"naman", "namanbhatia@gmail.com", Arrays.asList("12233","112423")),
                new Customer(101,"ishant", "ishanth@gmail.com", Arrays.asList("12673","1212433")),
                new Customer(101,"ashu", "ashu@gmail.com", Arrays.asList("154623","123453"))

        ).collect(Collectors.toList());

    }
}
