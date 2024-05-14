import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String [] items = {"Apple", "mangos", "bananas"};
        List<String> l1 = List.of(items);  // this is a factory static method in java class which returns a list
        // above method transforms an array of string into a list of string
        System.out.println(l1);

        //System.out.println(List.getClass().getName());
       // l1.add("yogurt"); // we will get an error over here

        ArrayList<String> groceryList = new ArrayList<>(l1);
        groceryList.add("yogurt");
        System.out.println(groceryList);

        ArrayList<String> anotherList = new ArrayList<>(List.of("pickel", "shampoo"));
        System.out.println(anotherList);

        groceryList.addAll(anotherList);
        System.out.println(groceryList);
        System.out.println(groceryList.get(2));

        if(anotherList.contains("eggs")){
            System.out.println("correct list");
        }

        System.out.println("first:" + groceryList.indexOf("bananas"));
        System.out.println(groceryList);
        groceryList.remove(1);
        System.out.println(groceryList);

        //groceryList.retainAll(List.of("asd"));
       // ArrayList<String> s1 = new ArrayList<>(List.of("31","31"));

        System.out.println("is empty"+ groceryList.isEmpty());
        System.out.println(groceryList);

        groceryList.addAll(List.of("ham", "burger", "cheeze"));
        groceryList.addAll(Arrays.asList("milk"));  // arrays.addlist is basically an list representation of array
        System.out.println(groceryList);
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
        groceryList.sort(Comparator.reverseOrder());
        System.out.println(groceryList);




    }



}
