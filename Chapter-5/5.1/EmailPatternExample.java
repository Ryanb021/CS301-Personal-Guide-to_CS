// Applications

public class EmailPatternExample {
    public static void main(String[] args) {
        
        String email = "student@example.com";

        // Basic email pattern check
        boolean valid = email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");

        System.out.println(valid);
    }
}
