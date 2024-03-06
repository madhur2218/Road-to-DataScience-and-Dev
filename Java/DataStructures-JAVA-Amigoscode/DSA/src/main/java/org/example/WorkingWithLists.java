package org.example;

import java.util.ArrayList;
import java.util.List;
public class WorkingWithLists {

    public static void main(String a[]){

        List<String>colors = new ArrayList<>();

        // Add "blue" to the list
        colors.add("blue");
        colors.add("red");
        colors.add("black");

//        colors.add(1);
//        colors.add(new Object());
        System.out.println(colors);
        System.out.println(colors.contains("yellow"));

        for(String s : colors){
            System.out.println(s);
        }

        colors.forEach(System.out::println);


        List<Integer>numbers = new ArrayList<>();
        numbers.add(120);
        numbers.add(5234);

        for(Integer i : numbers){
            System.out.println(i);
        }

        List<Object> list = new ArrayList<>();
        list.add(12);
        list.add("hello");
        for(Object o: list){
            System.out.println(o);
        }


    }
}

