public class AccessExample {
    public static void main(String[] args) {
        
        boolean hasID = true;
        boolean hasPermission = true;

        if (hasID && hasPermission) {
            System.out.println("Access granted");
        } else {
            System.out.println("Acces denied");
        }
    }
}
