class Base {
    void show() { System.out.println("Base"); }
}
class Derived extends Base {
    void show() {
        super.show();
        System.out.println("Derived");
    }
}
public class OverrideSuper {
    public static void main(String[] args) {
        new Derived().show();
    }
}
