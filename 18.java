public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9};
        int max = arr[0], min = arr[0];
        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
