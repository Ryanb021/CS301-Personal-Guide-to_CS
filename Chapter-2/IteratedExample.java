// Iterated Function Systems

// An iterated function system (IFS) repeatedly applies mathematical functions to create patterns.

// These patterns can produce shapes called fractals.

public class IteratedExample {
    public static void main(String[] args) {

        double number = 100;

        // Repeat calculation five times
        for (int i = 0; i < 5; i++) {
            number = number / 2;

            System.out.println(number);
        }
    }
}
