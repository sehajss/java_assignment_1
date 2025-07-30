class Book {
    String title;

    Book() {
        title = "Unknown";
    }

    Book(String t) {
        title = t;
    }

    void show() {
        System.out.println("Title: " + title);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics");
        b1.show();
        b2.show();
    }
}
