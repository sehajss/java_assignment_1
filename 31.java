import java.util.*;
public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3};
        Set<Integer> set = new LinkedHashSet<>();
        for (int n : arr) set.add(n);
        for (int n : set) System.out.print(n+" ");
    }
}
