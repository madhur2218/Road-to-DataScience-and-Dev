import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPerson();

//        for(Person p : p1){
//            System.out.println(p.getName() + p.getSalary()+p.getAge() + p.gender);
//        }

        //Imperative approach
        List<Person> female = new ArrayList<>();
        for (Person p : people) {
            if (p.getGender().equals(Gender.FEMALE)) {
                female.add(p);
            }
        }

        female.forEach(System.out::println);


        //Declerative Approach
        //Filer, sort, min,max,sort, group, all match, any match, none match

        //Filter
        List<Person> males = people.stream()
                .filter(person -> person.getGender() == Gender.MALE)
                .collect(Collectors.toList());

        males.forEach(System.out::println);

        //Sorting
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());

        for (Person p1 : sorted) {
            System.out.println(p1.getAge());
        }
        //sorted.forEach((person)-> System.out.println(person.getAge()));

        //All Match - returns T or F
        boolean result = people.stream()
                .allMatch(person -> person.getAge() > 34);

        System.out.println(result);

        //Any Match - returns T or F
        boolean result1 = people.stream()
                .anyMatch(person -> person.getAge() > 34);

        System.out.println(result1);

        //None Match - returns T or F
        boolean nonMatch = people.stream()
                .noneMatch(person -> person.getName().equals("antonio"));
        System.out.println(nonMatch);

        //Max
        people.stream()
                .max(Comparator.comparing(person -> person.getSalary()))
                .ifPresent(person -> System.out.println(person));

        //Group Info
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, personList) -> {
            System.out.println(gender + ":");
            personList.forEach(System.out::println);
            System.out.println();
        });

        //Chaining of stream
        Optional<String> s = people.stream()
                .filter(person -> person.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(person -> person.getAge()))
                .map(person -> person.getName());

        s.ifPresent(System.out::println);
    }


    private static List<Person> getPerson(){
        return List.of(
                new Person("madhur",23,1122, Gender.FEMALE),
        new Person("ishant",12,34, Gender.MALE),
        new Person("naman",122,314, Gender.FEMALE)
        );
    }
}
