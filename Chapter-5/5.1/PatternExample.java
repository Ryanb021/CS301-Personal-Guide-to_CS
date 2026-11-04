// Applications of Kleene's Theorem

public class PatternExample {
    public static void main(String[] args) {
        
        String studentID = "12345";

        // Check for exactly five digits
        boolean valid = studentID.matches("[0-9]{5}");

        System.out.println("Valid ID: " + valid);
    }
}
