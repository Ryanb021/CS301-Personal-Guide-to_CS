// Spatial Vectors

public class VectorExample {
    public static void main(String[] args) {
        
        VectorExample vector = new VectorExample(3, 4);

        System.out.print("Length: " + vector.length());
    }

    private double x;
    private double y;

    // Constructor
    public VectorExample(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Calculate vector length
    public double length() {
        return Math.sqrt(x * x + y * y);
    }
}
