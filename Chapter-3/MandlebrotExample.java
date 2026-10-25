// Simple Mandlebrot Calculation

public class MandlebrotExample {
    public static void main(String[] args) {
        

        double real = 0;
        double imaginary = 0;

        double cReal = 0.3;
        double cImaginary = 0.2;

        // Repeat the calculation
        for (int i = 0; i < 5; i++) {

            double newReal = real * real - imaginary * imaginary + cReal;

            double newImaginary = 2 * real * imaginary + cImaginary;

            real = newReal;
            imaginary = newImaginary;
        }

        System.out.println("Real: " + real);
        System.out.println("Imaginary: " + imaginary);
    }
}
