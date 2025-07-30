public class Largest {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 7;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest: " + max);
    }
}
