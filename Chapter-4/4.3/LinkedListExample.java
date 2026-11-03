// Linked Lists
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<>();

        // Add names
        names.add("Alex");
        names.add("Sam");
        names.add("Chris");

        // Remove the first name
        names.removeFirst();

        System.out.println(names);
    }
}
