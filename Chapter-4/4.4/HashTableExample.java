// Hash Tables
import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alex", 20);
        ages.put("Sam", 25);

        System.out.println(ages.get("Sam"));
    }
}
