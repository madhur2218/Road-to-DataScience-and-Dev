import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> node1= new LinkedList<>();
       //Adding elements
        node1.add(1);
        node1.add(2);
        node1.add(3);
        node1.add(3,66);

        System.out.println(node1);

        System.out.println(node1.get(2)); //O(n)

        node1.addFirst(0);
        node1.addLast(4);
        System.out.println(node1);

        //Removing elements
        node1.remove(4);
        node1.removeFirst();
        node1.removeLast();
        node1.removeIf(x->x%2==0);  //removes all even elements from linkedlist
        System.out.println(node1);

        //LinkedList of string
        List<String> animals = new LinkedList<>(Arrays.asList("dog","cat","hen"));
        List<String> animalsRewmove = new LinkedList<>(Arrays.asList("dog","hen"));

        animals.removeAll(animalsRewmove);
        System.out.println(animals);

        LinkedList<String> liquid = new LinkedList<>();
        liquid.add("water");
        

    }
}

//Inertion and deletion is easy in LinkedList as we do not have to shift elements like in arraylist
//Linkedlist has slower random access bcoz it has to traverse to each index to retrieve desired element
//LinkedList requires more memory than ArrayList as each node in memory requires extra space to store reference of previous and next node

//Insertion(first,last,in between), Deletion(first,last,in between), Updation(first,last,in between)
//LinkedList can act as List, Stack and Queue