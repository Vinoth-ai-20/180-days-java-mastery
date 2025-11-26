package day01.basics;

public class Person {
    private String name;
    private int age;
    private String email;

    //default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.email = "unknown@email.com";
    }

    public Person(String name, int age, String email) {
        this.name = name;
        setAge(age);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid Age!");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Invalid email.");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
