public class SumOfProducts {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = false;

        boolean result = (a && !b) || (!a && b);

        System.out.println(result);
    }
}
