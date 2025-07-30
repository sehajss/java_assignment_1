class Person {
    private String name;
    private int age;

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("John");
        p.setAge(25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }
}
