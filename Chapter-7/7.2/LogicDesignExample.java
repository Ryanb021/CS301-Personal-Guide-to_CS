public class LogicDesignExample {
    public static void main(String[] args) {
        
        boolean power = true;
        boolean button = true;

        // Light turns on when both are true
        boolean light = power && button;

        System.out.println("Light on: " + light);
    }
}
