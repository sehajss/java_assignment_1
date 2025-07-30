final class FinalClass {
    final int x = 100;

    final void show() {
        System.out.println("Final method in final class with x = " + x);
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.show();
    }
}
