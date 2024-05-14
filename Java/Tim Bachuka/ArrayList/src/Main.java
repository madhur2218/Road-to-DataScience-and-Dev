import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "dairy", 1);
    }
}

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        GroceryItem [] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apple", "Fruits", 2);
        groceryArray[2] = new GroceryItem("ORANGE", "fRUIT", 2);
        System.out.println(Arrays.toString(groceryArray));


        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("BUTTER"));
        objectList.add("orange");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("MILK","DAIRY", 12));
        groceryList.add(new GroceryItem("orange"));
        groceryList.add(0,new GroceryItem("apples", "friut", 34));
        groceryList.remove(2);




        System.out.println(groceryList);






    }
}