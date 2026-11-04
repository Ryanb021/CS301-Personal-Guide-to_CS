// Universal Virtual Turing Machine

public class UniversalMachineExample {
    public static void main(String[] args) {
        
        String instruction = "ADD";

        int a = 10;
        int b = 5;

        if (instruction.equals("ADD")) {
            System.out.println(a + b);
        } else if (instruction.equals("MULTIPLY")) {
            System.out.println(a * b);
        }
    }
}
