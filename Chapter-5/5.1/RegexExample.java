// generalized REs

public class RegexExample {
    public static void main(String[] args) {
        

        String text = "12345";

        // Check if the text contains only digits
        boolean result = text.matches("[0-9]+");

        System.out.println(result);
    }
}
