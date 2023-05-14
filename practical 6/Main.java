class Person {
    public String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Youssef";
        p1.setAge(20);
        ;

        Person p2 = new Person();
        p2.name = "Spider-Man";
        p2.setAge(32);
        ;

        System.out.println("Person 1: Name = " + p1.name + ", Age = " + p1.getAge());
        System.out.println("Person 2: Name = " + p2.name + ", Age = " + p2.getAge());
    }
}