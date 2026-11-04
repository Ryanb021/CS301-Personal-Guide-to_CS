// Nondeterminism
import java.util.HashSet;
import java.util.Set;

public class NFAExample {
    public static void main(String[] args) {
        
        String input = "1101";

        // Start in state 0
        Set<Integer> states = new HashSet<>();
        states.add(0);

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            Set<Integer> next = new HashSet<>();

            for (int state : states) {

                if (state == 0) {

                    if (c == '0') {
                        next.add(0);
                    } else if (c == '1') {
                        next.add(0);
                        next.add(1);
                    }

                } else if (state == 1) {
                    
                    if (c == '0' || c == '1') {
                        next.add(1);
                    } 
                }
            }

            states = next;
        }

        if (states.contains(1)) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }
    }
}
