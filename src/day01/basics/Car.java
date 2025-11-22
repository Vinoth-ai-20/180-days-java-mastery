package day01.basics;

public class Car {
    String brand;
    String model;
    int year;

    void displayDetails() {
        System.out.println(brand + "-" + model + "-" + year);
    }

    boolean isOldCar() {
        int currentYear = 2025;
        return (currentYear - year) > 10;
    }
}
