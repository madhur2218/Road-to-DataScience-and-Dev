import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       List l1 = new ArrayList<>();
       l1.add(0,10);
       l1.add(1,20);
       l1.add(2,30);
        System.out.println(l1);

        //Addition
        List l2 = new ArrayList<>();
        l1.add(0,10);
        l1.add(1,20);
        l1.add(2,30);
        l1.add(3,40);

        l1.addAll(l2);
        System.out.println(l1);

        //Removal
        l1.remove(l1.get(0));
        System.out.println(l1);

        //Updation
        l1.set(0,50);
        System.out.println(l1);

        //Searching
        System.out.println(l1.indexOf(20));

        //Checking is element is present or absent
        System.out.println(l1.contains(12));

        int hashCode= l1.hashCode();
        System.out.println(hashCode);


        //LinkedList
        LinkedList ll = new LinkedList();
        //Insertion
        ll.add(1122);
        ll.add(42);
        ll.add(34);
        ll.add(65);
        System.out.println(ll);

        //Deletion
        System.out.println(ll.remove(1));

        ll.add(0,123);
        System.out.println(ll);

        //Searching
     ll.contains(12);

     //Updation
     ll.set(1,23);

     System.out.println(ll.element());
     System.out.println(ll.peek());


     //push , pop, peek , display

     LinkedList stack = new LinkedList();
     stack.add(12);
     stack.add(32);
     stack.add(12);
     stack.add(65);
     stack.add(12);

     System.out.println(stack.peek());
     stack.push(54);
     stack.pop();
     System.out.println(stack);


     //Stack
     Stack s1 = new Stack();
     s1.push(10);
     s1.push(20);
     s1.push(30);
     System.out.println(s1);
     s1.pop();
     System.out.println(s1);
     System.out.println(s1.peek());


     //HashSet
     Set set1 = new HashSet();

     //Adding elements
     set1.add(10);
     set1.add(20);
     set1.add(30);
     set1.add(40);
     set1.add(50);
     set1.add(10);
     System.out.println(set1);

     //Removing elements
     set1.remove(10);
     set1.remove(20);

     Iterator i = set1.iterator();
     while(i.hasNext()){
      System.out.println(i.next());

     }


     //Java Streams

     ArrayList al1 = new ArrayList();
     al1.add(3);
     al1.add(43);
     al1.add(42);
     al1.add(12);
     al1.add(76);

     al1.forEach(System.out::println);
     System.out.println(al1);


     List<Person> people = getpeople();
     System.out.println(people);

     List<Person> females = new ArrayList<>();
     for(Person p : people){
      if(p.getGender().equals(Gender.Female)){
         females.add(p);

      }
     }

     System.out.println(females);


     //Declerative Approach
     //filter, sort, all match, any match, none match, max, min, group - some functions

     //filter
     List<Person> collect1 = people.stream()
             .filter(p -> p.getGender().equals(Gender.Female)).collect(Collectors.toList());
    collect1.forEach(System.out::println);

     List<Person> collect = people.stream()
             .filter(p -> p.getGender().equals(Gender.Male))
             .collect(Collectors.toList());
     collect.forEach(System.out::println);


     //Sorting
     List<Person> collect2 = people.stream()
             .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
             .collect(Collectors.toList());

     System.out.println(collect2);

     people.stream()
             .sorted(Comparator.comparing(Person::getAge).thenComparing((Person::getName)))
             .collect(Collectors.toList());



     //AllMatch - returns boolean value
     boolean b = people.stream()
             .allMatch(person -> person.getAge() > 23);

     people.stream()
             .allMatch(person -> person.getAge()>11);

     //AnyMatch - return boolean value
     boolean b1 = people.stream()
             .anyMatch(p-> p.getGender().equals(Gender.Female));
     System.out.println(b1);

     people.stream()
             .anyMatch(person -> person.getGender().equals(Gender.Female));

     //NoneMatch
     boolean noneMatch = people.stream()
             .noneMatch(person -> person.getName().equals("Nasha"));
     System.out.println("None match" + noneMatch);

     people.stream()
                     .noneMatch(person -> person.getGender().equals("Ashu"));

     //Max - Min
     people.stream()
             .min(Comparator.comparing(Person::getAge))
             .ifPresent(System.out::println);

     people.stream()
             .max(Comparator.comparing(Person::getAge));

     people.stream()
             .max(Comparator.comparing(Person::getName).thenComparing(person -> person.getAge()>12));

     //Group
     Map<Gender, List<Person>> collect4 = people.stream()
             .collect(Collectors.groupingBy(Person::getGender));

     System.out.println(collect4);

    collect4.forEach((gender,people1)->{
     System.out.println(gender);
     people1.forEach(System.out::println);
    });

    //Chaining
     Optional<String> s = people.stream()
             .filter(person -> person.getGender().equals(Gender.Male))
             .max(Comparator.comparing(Person::getAge))
             .map(Person::getName);
     s.ifPresent(System.out::println);

     people.stream()
             .filter(p-> p.getAge()>22)
             .map(n->n.getName().toUpperCase())
             .collect(Collectors.toList())
             .forEach(System.out::println);

     people.parallelStream()
             .filter(ps1->ps1.getAge()>23).limit(2)
             .map(Person::getName)
             .collect(Collectors.toList())
             .forEach(System.out::println);


     List<Integer> allList = Arrays.asList(10,20,30,40,50,60);

     List<Integer> evenNumberList = allList.stream()
             .filter(l -> l % 2 == 0)
             .collect(Collectors.toList());
     evenNumberList.forEach(System.out::println);

     allList.stream()
             .filter(l -> l % 2 == 0)
             .collect(Collectors.toList())
             .forEach(System.out::println);

     List<String> ls1 = new ArrayList<>();   //filter accepts a perdicate
     ls1.add("Madhur");
     ls1.add("Ishant");
     ls1.add("Naman");
     ls1.add("Malhar");
     ls1.add("Naveen");
     List names = new ArrayList();

     names =  ls1.stream()
             .filter(name->name.length()>6).collect(Collectors.toList());

     ls1.stream()
             .filter(name->name.length()>6).collect(Collectors.toList())
             .forEach(System.out::println);

     List removeNulls = Arrays.asList("cup", null, 23, null, "pen", "paper", null,12);

     removeNulls.stream()
             .filter(removeNulls1->removeNulls1 != null)
             .collect(Collectors.toList());

     List againRemoveNulls = new ArrayList();
     againRemoveNulls.add("ashu");
     againRemoveNulls.add("madhur");
     againRemoveNulls.add(12);
     againRemoveNulls.add(23);

     againRemoveNulls.stream()
             .filter(againRemoveNulls1->againRemoveNulls1 != null)
             .collect(Collectors.toList());

//     againRemoveNulls.stream()
//             .filter(againRemoveNulls2->againRemoveNulls2==null)
//             .forEach(pr-> System.out.println(pr.price));


     List<String> vehicles = new ArrayList<>();   //map takes a function
     vehicles.add("bmw");
     vehicles.add("tata");
     vehicles.add("mercedes");
     vehicles.add("ferrari");
     vehicles.add("camry");

     List<String> vehicles_filtered = vehicles.stream()
             .map(v -> v.toUpperCase())
             .collect(Collectors.toList());
     vehicles_filtered.forEach(System.out::println);

     vehicles.stream()
             .map(v-> v.length()).collect(Collectors.toList()).forEach(System.out::println);

     List<Integer> int_list = new ArrayList();

     int_list.stream()
             .map(x->x*3).forEach(System.out::println);


     //Combination of Filter and Map



     //Read about consumer and predicate




    }





    public static List<Person> getpeople(){
     return List.of(
             new Person("Madhur", Gender.Male, 23),
     new Person("Malhar", Gender.Female, 22),
     new Person("Naman", Gender.Male, 22),
     new Person("Ishant", Gender.Male, 23),
     new Person("Ashu", Gender.Male, 24),
     new Person("Mohini", Gender.Female, 23)

     );

    }
}