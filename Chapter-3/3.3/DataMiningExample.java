// Application: Data Mining

public class DataMiningExample {

    public static void main(String[] args) {

        int[] sales = {10, 20, 15, 30, 25};

        int total = 0;

        // Add all sales
        for (int sale : sales) {
            total += sale;
        }

        double average = (double) total / sales.length;

        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + average);
    }
}