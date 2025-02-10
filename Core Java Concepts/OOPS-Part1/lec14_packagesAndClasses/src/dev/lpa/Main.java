package dev.lpa;

import com.abc.first.item;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Package helps in encapsulate classes from other classes
        //Package has hierarchical structure, meaning we can group types in tree like structure

        item i = new item("package");

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Entered number is  "+ a );


    }
}