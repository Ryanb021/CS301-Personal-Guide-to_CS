// Counting DNA Letters

public class DNAExample {

    public static void main(String[] args) {
        
        String dna = "ABRACADABRA";

        int countA = 0;

        // Count how many A letters appear
        for (int  i = 0; i < dna.length(); i++) {

            if (dna.charAt(i) == 'A') {
                countA++;
            }
        }

        System.out.println("DNA: + dna");
        System.out.println("Number of A: " + countA);
    }
}
