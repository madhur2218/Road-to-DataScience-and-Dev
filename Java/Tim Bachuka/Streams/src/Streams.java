import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //Intermediate operations on streams - which return another stream
        //filter,map,sorted,limited,skip

        List<Employee> e1 = new ArrayList<>();
        e1.add(new Employee(1,"madhur"));
        e1.add(new Employee(2,"HIMANSHI"));
        e1.add(new Employee(3,"naman"));
        e1.add(new Employee(4,"ishant"));

        List<Employee> collect = e1.stream()
                .filter(emp -> emp.getId() >=2)
                .collect(Collectors.toList());

        for(Employee e : collect){
            System.out.println(e.getName() + " " + e.getId());
        }


        List<Integer> intList = Arrays.asList(1,2,3,4,5);

//        intList.stream()
//                .filter(num -> num % 2 == 0)
//                .map(num->num +num)
//                .filter(num->num>1)
//                .forEach(System.out::println);
        System.out.println("Streams below:");

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,21,12,6,7,4,8);

        l1.stream()
                .filter(i-> i %2==0).map(i-> i+ " ").forEach(System.out::print);

        List<String> l2 = Arrays.asList("aca", "bbbv","ccs", "aaaaa");
        l2.stream()
                .flatMap(a-> Stream.of(a.charAt(2)))
                .forEach(System.out::println);

        l2.stream()
                .distinct().forEach(System.out::println);  //Prints out distinct values

        l1.stream()
                .sorted().forEach(System.out::println);

        List<Integer> collect1 = l1.stream()
                .sorted().collect(Collectors.toList());

        for(Integer i : collect1){
            System.out.println(i);
        }


        //Terminal Operations in Streams

        //toarray
        List<Integer> l3 = Arrays.asList(2,3,1,1,4,2,1,4,5);

        Object[] array = l3.stream()
                .toArray();//converted to array from a list
        System.out.println(array[0]);

//collect.toset
       l3.stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("counting");

        //count
        long count = l3.stream()
                .count();

        System.out.println(count);

        //reduce
        Integer reduce = l3.stream()
                .reduce(0, (x, y) -> x + y);

        System.out.println(reduce);

        //foreach
        System.out.println("for each");
        l3.stream()
                .forEach(System.out::println);

        //min and max - use comparator
        Optional<Integer> min = l3.stream()
                .min(Integer::compareTo);
        min.ifPresent(System.out::println);

        //anyMatch()
        //allMatch()
        //noneMATCH()
        //findAny()
        //findFirst()




    }

//Intermediate Operations
    //filter
    //map
    //flatMap
    //distinct
    //sorted
    //peak
    //limit
    //skip

}
