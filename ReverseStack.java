//  Question 1: Reverse a Stack You are given a stack of integers. Your task is to reverse the order of the elements in the stack using only stack operations (push and pop) and without using any additional data structures. Ex. stack = [1, 2, 3, 4, 5] reverse Stack(stack) print(stack) Output should be [5, 4, 3, 2, 1].

import java.util.Stack;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int bottom = popBottom(stack);
        reverseStack(stack);
        stack.push(bottom);
    }
    private static int popBottom(Stack<Integer> stack) {
        int top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            int bottom = popBottom(stack);
            stack.push(top);
            return bottom;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
