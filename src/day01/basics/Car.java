package day01.basics;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year > 1886 && year <= 2025) {
            this.year = year;
        } else {
            System.out.println("Invalid Year!");
        }
    }

    void displayDetails() {
        System.out.println(brand + "-" + model + "-" + year);
    }

    boolean isOldCar() {
        int currentYear = 2025;
        return (currentYear - year) > 10;
    }
}
