import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Streams practice");

        List<Person> male = Main.getPerson();

       //fILTERING
        List<Person> filteredMales = male.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        //Sorting
        List<Person> sortedMales = male.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        //Reversing a sorted list of males
        male.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        //All match
        boolean b = male.stream()
                .allMatch(person -> person.getAge() > 5);

        
        //AnyMatch
        boolean b1 = male.stream()
                .anyMatch(person -> person.getAge() > 2);

        //None Match
        boolean b2 = male.stream()
                .noneMatch(person -> person.getName().equals(12));


        //Max and Min age
        Optional<Person> max = male.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        //Grouping
        male.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        //Map
        male.stream()
                .filter(person -> person.getAge()>2)
                .map(person -> person + ",")
                .forEach(System.out::println);

        //Flatmap
        male.stream()
                .filter(person ->person.getGender().equals(Gender.MALE))
                .flatMap(person-> Stream.of(person.getAge()>1)).forEach(System.out::println);

        //Distinct
        male.stream()
                .distinct()
                .forEach(System.out::println);

        male.stream()
                .peek(p->p.getGender()).findFirst();


        male.stream()
                .skip(2).forEach(System.out::println);




        //Terminal Operations




    }
}
