// Linked Structures

public class MachineLinkedExample {

    static class Node {
        int value;
        Node next;
        
    }
    public static void main(String[] args) {
        
        Node first = new Node();
        Node second = new Node();

        first.value = 10;
        second.value = 20;

        first.next = second;

        System.out.println(first.next.value);
    }
}
