public class Prime {
    public static void main(String[] args) {
        int n = 13, i;
        boolean prime = n > 1;
        for (i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) prime = false;
        System.out.println(prime ? "Prime" : "Not prime");
    }
}
