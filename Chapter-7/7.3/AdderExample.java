public class AdderExample {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 1;

        int sum = a ^ b;
        int carry = a & b;

        System.out.println("Sum: " + sum);
        System.out.println("Carry: " + carry);
    }
}
