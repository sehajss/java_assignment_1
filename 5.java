class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void sound() {
        System.out.println("Moo");
    }
}

public class AnimalPoly {
    public static void main(String[] args) {
        Animal a1 = new Cat();
        Animal a2 = new Cow();
        a1.sound();
        a2.sound();
    }
}
