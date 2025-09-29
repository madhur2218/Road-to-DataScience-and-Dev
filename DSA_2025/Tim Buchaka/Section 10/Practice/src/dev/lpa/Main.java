package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        GroceryItem [] groceryArray = new GroceryItem[5];

        groceryArray[0] = new GroceryItem("amul", "milk", 1);
        groceryArray[1] = new GroceryItem("motherdairy", "milk", 2);
        groceryArray[2] = new GroceryItem("motherdairy", "butter", 3);
        groceryArray[3] = new GroceryItem("nandini");

        System.out.println(Arrays.asList(groceryArray));

        ArrayList<GroceryItem> groceryArrayList = new ArrayList<>(Arrays.asList(groceryArray));
        System.out.println(groceryArrayList);

        //Adding values in this arrayList
        groceryArrayList.add(new GroceryItem("london dairy"));
        System.out.println(groceryArrayList.contains(new GroceryItem("london dairy")));

        System.out.println("----------------------");
        ArrayList<GroceryItem>groceryList2= new ArrayList<>(Arrays.asList(groceryArray));
        System.out.println(groceryList2);
        groceryList2.add(new GroceryItem("orange", "juice",4));
        System.out.println(groceryList2);

        groceryList2.set(0,new GroceryItem("apple", "juice",1));
        System.out.println(groceryList2);

        groceryList2.removeFirst();
        System.out.println(groceryList2);


        System.out.println("---------LEC 3 -------------");





    }
}
