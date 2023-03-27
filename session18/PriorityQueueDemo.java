package session18;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        //create priority queue
        PriorityQueue queue = new PriorityQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);



        System.out.println(queue); //10,20,30,40

        queue.offer(50);
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue);

        System.out.println(queue.poll());
    }
}
