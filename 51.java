public class SplitStr {
    public static void main(String[] args) {
        String s = "Java is fun";
        String[] words = s.split(" ");
        for (String w : words)
            System.out.println(w);
    }
}
