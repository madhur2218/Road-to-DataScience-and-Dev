import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Contains Duplicates and in ordered collection, indexed based access
        //Arraylist changes size dynamically
        int arr[] = new int[10];

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);

        System.out.println(list.get(0));
        System.out.println(list.size());

        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int i : list){
            System.out.println(i);
        }







    }
}


// Iterable -> Collection -> LIST(ArrayList, LinkedList, Stack), SET(HasSet, LinkedHashset, TreeSet, EnumSet), QUEUE(LinkedList, PriorityQueue, Deque)
