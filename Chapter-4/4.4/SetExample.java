// Set Data Type
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        
        HashSet<String> names = new HashSet<>();

        names.add("Alex");
        names.add("Sam");
        names.add("Alex");
        
        System.out.println(names.size());
        System.out.println(names.contains("Sam"));
    }
}
