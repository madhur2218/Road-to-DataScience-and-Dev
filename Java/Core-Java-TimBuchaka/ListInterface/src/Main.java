import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
record GroceryItem(String name, String type, int count){
    GroceryItem(String name){
        this(name, "Dairy",1);
    }

}
public class Main {
    public static void main(String[] args) {

        Object[] groceryItem = new Object[5];
        groceryItem[0] = new GroceryItem("Cow Milk");
        groceryItem[1] = new GroceryItem("Buffalo Milk");
        groceryItem[2] = "Low fat cow Milk";
        groceryItem[3] = new GroceryItem("Double fat cow milk", "Milk",3);

        System.out.println(groceryItem[3].toString());
        System.out.println(Arrays.toString(groceryItem));

        GroceryItem gc = new GroceryItem("Cow Milk");

        //ArrayList<GroceryItem> list1 = new ArrayList<>(Arrays.asList(groceryItem));
        //System.out.println(list1);

        ArrayList objectList = new ArrayList();
        objectList.add("milk");
        objectList.add(new GroceryItem("COW MILK"));
        objectList.add(new GroceryItem("buffallo MILK"));

        GroceryItem g1 = new GroceryItem("milk");
        GroceryItem g2 = new GroceryItem("cow milk");
        GroceryItem g3 = new GroceryItem("buffallo milk");

        ArrayList<GroceryItem> l1 = new ArrayList<>();
        l1.add(g1);
        l1.add(g2);
        l1.add(g3);

        System.out.println("List is :"+l1);






    }
}