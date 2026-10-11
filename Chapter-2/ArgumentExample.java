// Passing Arguments and Returning Values:

// An argument is a value sent to a method.

// A parameter is a variable that receives the value.

public class ArgumentExample {

    // The parameter is number
    public static int doubleNumber(int number) {
        return number * 2;
    }

    public static void main(String[] args) {

        // Pass 10 as an argument
        int result = doubleNumber(10);

        System.out.println(result);
    }

}
