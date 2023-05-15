public class Main {
    public static void main(String args[]) {
        Teacher t = new Teacher("Salamoony", 40);
        Student s = new Student("Youssef", 20);

        s.setTeacher(t);
        s.displayStudentInfo();

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
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Student " + name + " has " + age + " years");
    }

    public void displayStudentInfo() {
        System.out.println(
                name + " who has age " + age + " is taught by " + teacher.name + " who has age " + teacher.age);
    }
}