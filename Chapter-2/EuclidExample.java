/*
Euclid's algorithm finds the greatest common divisor (GCD) of two numbers.

The GCD is the largest number that divides both numbers without a remainder.
*/

public class EuclidExample {

    // Find the greatest common divisor
    public static int gcd(int a, int b) {

        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive call
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        
        System.out.println(gcd(24, 8));
    }
    
}
