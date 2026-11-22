public class MuxExample {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        int select = 1;

        int output = (select == 0) ? a : b;

        System.out.println(output);
    }
}
