import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Linkedlist implements a queue and stack
        //Linked list can be considered as a double ended queue -FIFO
        //Stack can be considede as a certical pile of elements -LIFO

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("sydney");
        l1.add(0, "canada");
        l1.add(1, "australia");

        System.out.println(l1);

        addMoreElements(l1);
        System.out.println(l1);

        removeElements(l1);
        System.out.println(l1);

        //removeElements();



    }

    public static void addMoreElements(LinkedList<String> list){
        list.addFirst("india");
        list.addLast("punjab");

        //Queue operations
        list.offerFirst("perth");
        list.offerLast("mobile");

        //Stack methods
        list.push("alice spring");

    }

    public static void removeElements(LinkedList<String> list){
        list.remove("punjab");

        System.out.println(list);
        String s1 =  list.remove();  // removes first element from list and returns the removed element
        System.out.println(s1 + "was removed");

        String s2 = list.removeFirst(); // this is same as remove as they remove the first element
        System.out.println(s2 + " was removed");
    }

}