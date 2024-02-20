package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        // Add persons to the supermarket queue
        supermarket.add(new Person("madhur", 1));
        supermarket.add(new Person("ashu", 2));

        // Print the contents of the supermarket queue
        System.out.println("Supermarket queue: " + supermarket);
        System.out.println(supermarket.peek());
    }

    // Define a record for Person
    static record Person(String name, int id) {
        // Record constructor is automatically generated
    }
}
