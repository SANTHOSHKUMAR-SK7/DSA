package STACK_and_QUEUE;

import java.util.LinkedList;
import java.util.Queue;

 class Queuee {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.size();


        System.out.println(queue.peek()); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.Returns: the head of this queue, or null if this queue is empty
        // Retrives, only we can view, we cant delete the elements.
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
