// Queue Applications
import java.util.Queue;
import java.util.LinkedList;

public class PrintQueueExample {
    public static void main(String[] args) {
        
        Queue<String> jobs = new LinkedList<>();

        jobs.offer("Document1");
        jobs.offer("Document2");
        jobs.offer("Document3");

        while (!jobs.isEmpty()) {
            System.out.println("Printing: " + jobs.poll());
        }
    }
}
