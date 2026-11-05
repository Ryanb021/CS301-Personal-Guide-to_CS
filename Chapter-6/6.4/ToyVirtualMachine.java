// TOY in Java

public class ToyVirtualMachine {
    public static void main(String[] args) {
        

        int[] registers = new int[16];

        // Store values in registers
        registers[1] = 10;
        registers[2] = 20;

        // Simulate an ADD instruction
        registers[3] = registers[1] + registers[2];

        System.out.println("Result: " + registers[3]);
    }
}
