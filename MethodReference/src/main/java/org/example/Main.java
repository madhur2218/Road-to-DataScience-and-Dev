package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test1{

    public static void print(String s) {
        System.out.println("hello world");
    }
}

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        List<String> s1 = Arrays.asList("madhur", "ashutosh", "naman");
        s1.add("madhur");
        s1.add ("ashu");

        s1.forEach(Test1::print);

    }
}