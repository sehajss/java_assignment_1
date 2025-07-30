class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism
        a.sound();
    }
}
