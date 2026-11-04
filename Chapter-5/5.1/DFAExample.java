// Java Implementation of DFAs

public class DFAExample {
    public static void main(String[] args) {
        
        String input = "1101";

        // State 0 = last symbol is not 1
        // State 1 = last symbol is 1
        int state = 0;

        boolean validInput = true;

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c== '0') {
                state = 0;
            } else if (c == '1') {
                state = 1;
            } else {
                validInput = false;
                break;
            }
        }

        // Accept if the input is binary and ends in 1
        if (validInput && state == 1) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
