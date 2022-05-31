package collectionExamples;

import java.util.Stack;

//push pop using stack class (LIFO)
public class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Joon");
        System.out.println(stack);
        stack.push("Jin");
        stack.push("Yoon");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("First : "+stack.peek());   //top of the stack
        System.out.println("Find : "+stack.search("Jin"));   //-1 for not found and 1 for found
    }
}
