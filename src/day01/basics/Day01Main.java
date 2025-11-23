package day01.basics;

import java.util.Scanner;

public class Day01Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Alchemist", "Paulo Choleo", 150);
        book1.displayInfo();
        System.out.println("Is the book long: " + book1.isLongBook());
        System.out.println("\n --- \n");

        Book book2 = new Book("Maadhorupagan", "Perumal Murugan", 189);
        book2.displayInfo();
        System.out.println("Is the book long: " + book2.isLongBook());

        book1.setPages(-10);
        book1.setPages(359);
        System.out.println("Updated Pages: "+ book1.getPages());
        System.out.println("\n --- \n");

        //Test Student Class
        Student student1 = new Student();
        student1.name = "Vinoth";
        student1.age = 22;
        student1.major = "M.E - CSE";

        student1.introduce();
        System.out.println("Is adult: " + student1.isAdult());
        System.out.println("\n --- \n");

        Car car1 = new Car();
        car1.brand = "Mahindhra";
        car1.model = "Thar";
        car1.year = 2024;

        car1.displayDetails();
        System.out.println("Is the car old? " + car1.isOldCar());
        System.out.println("\n --- \n");

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = "2345678765432";
        bankAccount1.ownerName = "Vinoth Murugan";
        bankAccount1.balance = 5000;

        bankAccount1.displayAccountInfo();
        System.out.println("Does the account has sufficient amount?: " + bankAccount1.hasSufficientAmount(1000));
        System.out.println("\n --- \n");

        Product product1 = new Product();
        product1.brand = "Britania";
        product1.productName = "ParleG";
        product1.price = 10;
        product1.stockQuantity = 100;

        product1.displayProductInfo();
        System.out.println("Is in Stock? " + product1.isInStock());
        System.out.println("\n --- \n");

        Calculator calculator1 = new Calculator();
        System.out.println("Addition: " + calculator1.add(12, 12));
        System.out.println("Subtraction: " + calculator1.subtract(12, 12));
        System.out.println("Multiply: " + calculator1.multiply(12, 12));
        System.out.println("Divide: " + calculator1.division(12, 12));

        System.out.println("\n --- \n");

    }
}
