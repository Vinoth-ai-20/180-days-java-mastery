package day01.basics;

public class Student {
    private String name;
    private int age;
    private String major;

    //Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.major = "Undeclared";
    }

    //Parameterized Constructor
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " Years old, Studying " + major);
    }

    boolean isAdult() {
        return age >= 18;
    }
}
