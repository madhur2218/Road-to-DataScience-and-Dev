package org.example;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String a[]){
        Stack <Integer> stack = new Stack<Integer>();

        stack.push(2);
        stack.push(1);
        stack.push(456);
        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.search(1));

    }
}
