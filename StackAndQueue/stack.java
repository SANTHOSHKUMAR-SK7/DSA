package STACK_and_QUEUE;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        CustomStackImplementation cs=new CustomStackImplementation();
        cs.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());  when we remove there is nothing in the stack.It shows the error "EmptyStackException"
        System.out.println(stack);
    }
}
