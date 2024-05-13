public class Main {
    public static void main(String args[]) {
        Teacher t = new Teacher("Salamoony", 40);
        Student s = new Student("Youssef", 20);

        t.displayInfo(); // Teacher salamoony has 40 years
        s.displayInfo(); // Student Youssef has 20 years

    }

}

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() { // default constructor as a fallback
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println(name + " has " + age + " years");
    }

}

class Teacher extends Person {
    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Teacher " + name + " has " + age + " years");
    }
}

class Student extends Person {
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student " + name + " has " + age + " years");
    }
}