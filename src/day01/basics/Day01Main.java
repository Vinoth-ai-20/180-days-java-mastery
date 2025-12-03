package day01.basics;

import java.util.Arrays;

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
        System.out.println("Updated Pages: " + book1.getPages());
        System.out.println("\n --- \n");

        //Test Student Class
        Student student1 = new Student("Vinoth", 22, "M.E - CSE");

        student1.introduce();
        System.out.println("Is adult: " + student1.isAdult());

        student1.setAge(22);
        System.out.println("Updated age: " + student1.getAge());
        System.out.println("\n --- \n");

        Car car1 = new Car("Mahindhra", "Thar", 2024);

        car1.displayDetails();
        System.out.println("Is the car old? " + car1.isOldCar());
        System.out.println("\n --- \n");

        BankAccount bankAccount1 = new BankAccount("2345678765432", "Vinoth Murugan", 5000);

        bankAccount1.displayAccountInfo();
        System.out.println("Does the account has sufficient amount?: " + bankAccount1.hasSufficientAmount(1000));
        System.out.println("\n --- \n");

        Product product1 = new Product("Britania", "ParleG", 10, 100);

        product1.displayProductInfo();
        System.out.println("Is in Stock? " + product1.isInStock());
        System.out.println("\n --- \n");

        Calculator calculator1 = new Calculator();
        System.out.println("Addition: " + calculator1.add(12, 12));
        System.out.println("Subtraction: " + calculator1.subtract(12, 12));
        System.out.println("Multiply: " + calculator1.multiply(12, 12));
        System.out.println("Divide: " + calculator1.division(12, 12));

        System.out.println("Square Root: " + calculator1.squareRoot(121));

        System.out.println("\n --- \n");

        System.out.println("--- Test - Person Class ---");
        Person person1 = new Person("Vinoth", 22, "vinoth.ac.in@gmail.com");
        person1.displayInfo();
        System.out.println("Is he adult? " + person1.isAdult());

        person1.setAge(23);
        System.out.println("Updated age: " + person1.getAge());

        System.out.println("--- Test - Rectangle Class ---");
        Rectangle rectangle1 = new Rectangle(20, 30);
        rectangle1.displayDetails();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLength(22);
        rectangle2.setWidth(10);
        rectangle2.displayDetails();

        Book book = new Book("God of rings", "larry", 300);
        book.displayInfo();
        System.out.println(book.getTitle());
        book.setTitle("Computers");
        System.out.println(book.getTitle());
        System.out.println(book.isLongBook());

        String str = "hello Boy";
        System.out.println(str.trim());
        System.out.println(str.split(" ").length);

        System.out.println(" --- Using String Helper Class --- ");
        StringHelper stringHelper = new StringHelper();
        System.out.println(stringHelper.reversedString("Hey Bro!"));
        System.out.println(stringHelper.countVowel("aeiou"));
        System.out.println(stringHelper.isPalindrome("mom"));

        System.out.println(" --- Using prime checker Class --- ");
        PrimeChecker primeChecker = new PrimeChecker();
        System.out.println(primeChecker.isPrime(7));
        System.out.println(primeChecker.isPrime(4321123));

        System.out.println(" --- Using Array Basics Class --- ");
        ArrayBasics ab = new ArrayBasics();
        ab.displayArray();
        ab.showLength();
        ab.showElements();

        System.out.println(" --- Using Array Utils Class --- ");
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = {10, 32, 14, 33, 89};
        System.out.println(arrayUtils.findMax(array));
        System.out.println(arrayUtils.findMin(array));
        System.out.println(arrayUtils.calculateSum(array));
        System.out.println(arrayUtils.calculateAverage(array));
        System.out.println(arrayUtils.findIndex(array, 89));
        System.out.println(Arrays.toString(arrayUtils.getReverseArray(array)));
    }
}
