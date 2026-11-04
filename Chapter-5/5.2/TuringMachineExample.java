// Turing Machine

public class TuringMachineExample {
    public static void main(String[] args) {
        
        char[] tape = {'0', '1', '0', '1'};

        int head = 0;

        // Read current symbol
        System.out.println("Reading: " + tape[head]);

        // Write a new symbol
        tape[head] = '1';

        // Move right
        head++;

        System.out.println("Head position: " + head);
        System.out.println("Tape: " + new String(tape));
    }
}
