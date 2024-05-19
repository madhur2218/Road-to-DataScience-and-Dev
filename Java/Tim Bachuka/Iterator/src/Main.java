import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<String> food = new ArrayList<>();
        food.add("pizza");
        food.add("ice cream");
        food.add("CHOCOLATE");
        food.add("water");

        Iterator<String> it = food.iterator();
        System.out.println(it.next());

        while(it.hasNext()){
            System.out.println(it.next());

        }

        it.remove();
        System.out.println(it.hasNext());

        //Iterator is forward only and only supports remove() method

        //ListIterator can be used to go both forward and backward and in addition to remove method it supports add and set methods
    }
}