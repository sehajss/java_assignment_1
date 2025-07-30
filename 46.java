class Parent {
    void show() { System.out.println("Parent"); }
}
class Child extends Parent {
    void show() { System.out.println("Child"); }
}
public class Polymorphism {
    public static void main(String[] args) {
        Parent ref = new Child();
        ref.show();
    }
}
