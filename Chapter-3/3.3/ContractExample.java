// Design by Contract

public class ContractExample {
    public static void main(String[] args) {
        
        System.out.println(divide(10, 2));
    }

    public static double divide(double a, double b) {

        // Check the precondition
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return a / b;
    }
}