public class PrimeCheck {
    public static void main(String[] args) {
        int num = 7, i = 2;
        boolean isPrime = true;
        while (i < num) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}
