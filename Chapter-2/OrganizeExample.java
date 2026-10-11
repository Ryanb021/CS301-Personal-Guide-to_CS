// Using Static Methods to Organize Code - Instead of putting everything inside main(), I can separate tasks into methods.

public class OrganizeExample {

    // Method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for multipication
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        // Call both methods
        System.out.println(add(5, 3));
        System.out.println(multiply(5, 3));
    }

}
