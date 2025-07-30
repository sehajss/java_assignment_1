public class StaticDemo {
    static void stat() { System.out.println("Static"); }
    void nonstat() { System.out.println("Non-static"); }
    public static void main(String[] args) {
        StaticDemo.stat();
        new StaticDemo().nonstat();
    }
}
