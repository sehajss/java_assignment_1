class Student {
    String name;
    Student(String n) { name = n; }
    void show() { System.out.println("Name: " + name); }
}
public class ParamCons {
    public static void main(String[] args) {
        Student s = new Student("Ali");
        s.show();
    }
}
