public class NBodyExample {
    public static void main(String[] args) {
        
        // Starting position
        double x = 0;
        double y = 0;

        // Velocity
        double vx = 2;
        double vy = 1;

        // Time step
        double dt = 1;

        // Update position 5 times
        for (int i = 1; i <= 5; i++) {

            x = x + vx + dt;
            y = y + vy * dt;

            System.out.println("Step " + i + ": (" + x + ", " + y + ")");
        }
    }
}
