// API
import java.util.HashMap;

public class SymbolTableExample {
    public static void main(String[] args) {
        
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Alex", 90);
        grades.put("Sam", 95);

        System.out.println(grades.get("Alex"));
    }
}
