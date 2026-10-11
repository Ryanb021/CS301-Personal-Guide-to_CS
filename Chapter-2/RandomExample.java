// Random Numbers

// Java can generate random numbers using Math.random().

public class RandomExample {

    public static void main(String[] args) {

        // Generate a random number from 1 to 10
        int number = (int) (Math.random() * 10 + 1);

        System.out.println(number);
    }
}
