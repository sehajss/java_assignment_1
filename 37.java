class Demo {
    int x;
    Demo() { x = 1; }
    Demo(int a) { x = a; }
}
public class TestCons {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        System.out.println(d1.x + " " + d2.x);
    }
}
