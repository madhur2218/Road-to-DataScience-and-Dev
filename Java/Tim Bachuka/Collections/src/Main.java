import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Collections include arrays,lists,dictionaries, sets,maps,vectors,queues,tables etc.
        //Arrays and array utilities are not considered part of collection
        //Maps do not implements collection framework
        //ArrayList vs TreeSet vs HashSet

        //list.sort(); will get error as collection interface does not have sort method
        //LinkedList implements both List and Dequeue
        //Sets do not contain duplicate element - HashSet, TreeSet and LinkedHashset
        //Map stores key-value pairs - Keys are set and Values are separate collection - keys are unique and values are not unique
        //Elements in a tree are also stored in key-value node called as an Entry

        List l1 = new ArrayList();
        List<String> l2 = new ArrayList<>();

        //Adding new elements to arraylist
        l2.add("ashu");
        l2.add("madhur");
        System.out.println(l2);


    }
}