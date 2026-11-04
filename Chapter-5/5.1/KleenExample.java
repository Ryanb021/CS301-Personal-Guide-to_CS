// Kleene's Theorem

public class KleenExample {
    public static void main(String[] args) {
        
        String input = "1101";

        // Binary strings ending in 01
        boolean result = input.matches("(0|1)*01");

        System.out.println("Accepted: " + result);
    }
}
