package CollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer>queue= new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);


//        System.out.println(queue.peek());//it returns null when queue is empty
//        System.out.println(queue.element());//it returns exception when queue is empty

        System.out.println(queue.poll());//it rmove head or it returns null when queue is empty
        System.out.println(queue.remove());//it returns excepton when queue is empty

    }
}
