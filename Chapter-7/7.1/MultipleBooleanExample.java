public class MultipleBooleanExample {
    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = true;
        boolean c = false;

        boolean result = a && b && !c;

        System.out.println(result);
    }
}
