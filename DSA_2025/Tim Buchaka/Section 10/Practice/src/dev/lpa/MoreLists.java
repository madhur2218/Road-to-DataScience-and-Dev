package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {

        String [] items = new String[3];
        items[0] = "milk";
        items[1] = "cheese";
        items[2] = "veggies";

        List itemsList = List.of(items);
        System.out.println(itemsList);

        ArrayList<String> itemsList2 = new ArrayList<>(List.of("milk2", "cheese2", "veggies2"));
       itemsList2.addAll(itemsList);
        System.out.println(itemsList2);

    }
}
