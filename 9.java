public class AccessDemo {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;

    void display() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
    }

    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.display();
    }
}
