// Modular programming means dividing a program into smaller parts.

// Each method or class performs a specific task.

public class ModularExample {
    // Method to add numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to subtract numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        // Use the methods
        System.out.println(add(10, 5));
        System.out.println(subtract(10, 5));
    }
}
