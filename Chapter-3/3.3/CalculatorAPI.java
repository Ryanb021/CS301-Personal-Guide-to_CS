public class CalculatorAPI {
    
    // Add two numbers
    public static void main(String[] args) {
        
        System.out.println(add(10, 5));
        System.out.println(subtract(10, 5));
    }

    // Add numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtract numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
}
