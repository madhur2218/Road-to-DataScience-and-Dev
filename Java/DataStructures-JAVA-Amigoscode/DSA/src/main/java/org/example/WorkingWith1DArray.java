package org.example;

import java.util.Arrays;

public class WorkingWith1DArray
{
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int [] arr= new int[5];
        arr[0] = 23;
        arr[1]= 34;

        for(int i=0; i<=arr.length;i++){
            System.out.println(arr[i]);
        }

        String [] colors = new String[5];
        colors[0] = "red";
        colors[1]= "blue";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[1]);
        System.out.println(colors[6]);


//        for(String colors : colors){
//            System.out.println(colors);
//
//        }

        Arrays.stream(colors).forEach(System.out::println);
    }
}