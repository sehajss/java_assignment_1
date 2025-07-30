interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
