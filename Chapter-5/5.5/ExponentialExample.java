public class ExponentialExample {
    public static void main(String[] args) {
        
        int n = 5;

        int possibilities = 1;

        // Double the number of possibilities n time
        for (int i = 0; i < n; i++) {
            possibilities *= 2;
        }

        System.out.println("Possibilities: " + possibilities);
    }
}
