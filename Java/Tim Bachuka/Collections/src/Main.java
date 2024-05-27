import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Collections include arrays,lists,dictionaries, sets,maps,vectors,queues,tables etc.
        //Arrays and array utilities are not considered part of collection
        //Maps do not implements collection framework
        //ArrayList vs TreeSet vs HashSet

        Collection<String> list = new TreeSet<>();

        String [] names ={"madhur", "ashutosh", "naman"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        list.add("ishant");
        list.addAll(Arrays.asList("bhatia", "mohini", "Gary"));
        System.out.println(list);
        boolean b =list.contains("Madhur");
        System.out.println("Madhur is contained in list :" + b);

        list.removeIf((str)-> str.charAt(0) == 'G');
        System.out.println(list);
        //list.sort(); will get error as collection interface does not have sort method
        //LinkedList implements both List and Dequeue
        //Sets do not contain duplicate element - HashSet, TreeSet and LinkedHashset
        //Map stores key-value pairs - Keys are set and Values are separate collection - keys are unique and values are not unique
        //Elements in a tree are also stored in key-value node called as an Entry

    }
}