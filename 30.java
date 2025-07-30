public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int key = 5, l = 0, r = arr.length - 1, mid;
        boolean found = false;
        while (l <= r) {
            mid = (l + r) / 2;
            if (arr[mid] == key) { found = true; break; }
            else if (arr[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        System.out.println(found ? "Found" : "Not Found");
    }
}
