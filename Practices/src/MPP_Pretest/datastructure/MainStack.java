package MPP_Pretest.datastructure;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Mayra");
        stack.add("Jimmy");
        stack.add("Ana");

        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
