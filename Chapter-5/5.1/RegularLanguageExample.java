// Regular Language

public class RegularLanguageExample {
    public static void main(String[] args) {
        
        String input = "1101";

        // Check if the string ends with 01
        if (input.matches("[01]+01")) {
            System.out.print("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
