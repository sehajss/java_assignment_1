public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        int sum = 0;
        for (int n : arr)
            sum += n;
        System.out.println("Sum: " + sum);
    }
}
