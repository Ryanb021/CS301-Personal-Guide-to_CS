/*
A Gray code is a sequence of binary numbers where each neighboring value differs by only one bit.
Gray codes are useful when only one bit should change at a time.
*/

public class GrayCodeExample {
    
    public static void main(String[] args) {
        
        // Generate 2-bit Gray codes
        for (int i = 0; i < 4; i++) {

            // Convert number to Gray code
            int gray = i ^ (i >> 1);

            // Print the value
            System.out.println(
                String.format("%2s",
                    Integer.toBinaryString(gray))
                    .replace(' ', '0')
            );
        }
    }
}
