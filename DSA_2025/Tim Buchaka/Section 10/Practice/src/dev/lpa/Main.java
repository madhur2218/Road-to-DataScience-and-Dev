package dev.lpa;

import java.sql.SQLOutput;
import java.util.*;

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

        List names = new ArrayList(Arrays.asList("madhur","ashutosh","naman"));
        System.out.println(names);

        List moreNames = new ArrayList(List.of("ishant","adarsh"));
        System.out.println(moreNames);

        names.addAll(moreNames);
        System.out.println(names);  //adding objects

        System.out.println("Third item in list:" + names.get(2)); //print element based on index

        System.out.println("Check if ishant is present in list");  //checking if element is present
        if(names.contains("ishant")){
            System.out.println("ishant is present in list");
        }

        System.out.println("Index of naman: "+ names.indexOf("naman"));

        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        //groceryArrayList.sort(Comparator.comparing(e -> e.name()));

        //Array vs ArrayList
        String [] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);

        originalList.sort(Comparator.naturalOrder());

        List<String> newList = Arrays.asList("mon","tues","wed");
        System.out.println(newList);

        System.out.println("----------ENUMS LECTURE-------");
        Seasons seasons = Seasons.FALL;
        System.out.println(seasons);


        Status s = Status.ERROR;
        System.out.println(s);
        System.out.println(s.getCode());

















    }
}
