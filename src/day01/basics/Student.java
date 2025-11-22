package day01.basics;

public class Student {
    String name;
    int age;
    String major;

    void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " Years old, Studying " + major);
    }

    boolean isAdult() {
        return age >= 18;
    }
}
