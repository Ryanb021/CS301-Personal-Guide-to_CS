// Fetch-Increment-Execute Style

public class FetchExample {
    public static void main(String[] args) {
        
        String[] instructions = {"LOAD", "ADD", "HALT"};

        int pc = 0;

        while (pc < instructions.length) {

            String instruction = instructions[pc];

            pc++;

            System.out.println("Executing: " + instruction);

            if (instruction.equals("HALT")) {
                break;
            }
        }
    }
}
