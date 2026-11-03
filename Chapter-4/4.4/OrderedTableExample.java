// Ordered Table-Symbol Operations
import java.util.TreeMap;

public class OrderedTableExample {
    public static void main(String[] args) {
        
        TreeMap<Integer, String> table = new TreeMap<>();

        table.put(10, "A");
        table.put(20, "B");
        table.put(30, "C");

        System.out.println(table.firstKey());
        System.out.println(table.lastKey());
        System.out.println(table.floorKey(25));
        System.out.println(table.ceilingKey(25));
    }    
}
