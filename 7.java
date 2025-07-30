class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void print() {
        System.out.println("this.a = " + this.a);
        System.out.println("super.a = " + super.a);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
