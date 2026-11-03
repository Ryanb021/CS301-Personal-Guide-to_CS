// Symbol Client Tables
import java.util.HashMap;

public class ClientExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Apples", 10);
        inventory.put("Bananas", 20);

        System.out.println("Apples: " + inventory.get("Apples"));
    }
}
