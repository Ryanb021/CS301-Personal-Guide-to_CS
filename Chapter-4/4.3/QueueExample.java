// FIFO Queues
import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        
        Queue<String> queue = new LinkedList<>();

        queue.offer("Alex");
        queue.offer("Sam");
        queue.offer("Chris");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
