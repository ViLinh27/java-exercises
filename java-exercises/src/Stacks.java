import java.io.*;
import java.util.*;

public class Stacks {
    // push element on top of stack
    // adding elements to stack
    static void stackpush(Stack<Integer> stack, int element) {
        stack.push(element);
    }

    // pop from top of stack
    static void stackpop(Stack<Integer> stack) {
        System.out.println("pop operation: ");
        Integer y = (Integer) stack.pop();
        System.out.println(y);
    }

    // display whats on top
    static void stackpeek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on top of stack: " + element);
    }

    // search element in stack
    static void stacksearch(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        if (pos == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element " + element + " is found at position: " + pos);
        }
    }

}

// from https://www.geeksforgeeks.org/stack-class-in-java/
