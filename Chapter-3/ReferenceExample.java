// Reference Types

public class ReferenceExample {
    public static void main(String[] args) {
        
        int[] a = {10, 20, 30};

        // b refers to the same array
        int[] b = a;

        // Change the first value using b
        b[0] = 99;

        System.out.println(a[0]);
    }
}
