// Elementary Symbol-Table Implementations

public class SimpleTableSymbol {
    public static void main(String[] args) {
        
        String[] keys = {"Alex","Sam", "Chris"};
        int[] values = {90, 85, 95};

        String target = "Sam";

        for (int i = 0; i < keys.length; i++) {

            if (keys[i].equals(target)) {
                System.out.println(values[i]);
                break;
            }
        }
    }
}
