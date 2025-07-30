public class ImmutableDemo {
    public static void main(String[] args) {
        String s = "abc";
        s.concat("d");
        System.out.println(s); // "abc"
    }
}
