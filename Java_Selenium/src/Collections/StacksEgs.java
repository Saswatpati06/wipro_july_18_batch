package Collections;

import java.util.Stack;

public class StacksEgs {

    public static void main(String[] args) {
       
        Stack<String> stack = new Stack<>();
        
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Date");
        stack.push("Elderberry");
        System.out.println("Original Stack: " + stack);

        // Pushing an element at the top
        stack.push("Musli");
        System.out.println("After push: " + stack);

        // Accessing the top element of the stack
        System.out.println("Top element (peek): " + stack.peek());

        // Popping or adding of  an element from the stack
        String removed = stack.pop();
        System.out.println("Popped element: " + removed);
        System.out.println("After pop: " + stack);

        // Searching for an element in the stack
        int pos = stack.search("Banana"); 
        System.out.println("Position of 'Banana': " + pos);

        // Size of the stack
        System.out.println("Size of stack: " + stack.size());

        // Clearing the whole stack  and checking its empty or not
        stack.clear();
        System.out.println("Cleared stack: " + stack);
        System.out.println("Is stack empty? " + stack.empty());
        
 
    }
}

