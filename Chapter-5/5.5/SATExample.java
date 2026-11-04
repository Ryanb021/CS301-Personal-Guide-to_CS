// Satisfiability

public class SATExample {
    public static void main(String[] args) {
        
        boolean found = false;

        // Try every combination of A and B
        for (int a = 0; a <= 1; a++) {

            for (int b = 0; b <= 1; b++) {

                boolean A = (a == 1);
                boolean B = (b == 1);

            // Formula: A AND (NOT B)
            if (A && !B) {

                System.out.println("Solution: A=" + A +", B=" + B);

                found = true;
            }
            
            }
        }

        if (!found) {
            System.out.println("No Solution");
        }
    }
}
