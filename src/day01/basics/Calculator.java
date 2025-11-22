package day01.basics;

public class Calculator {
    double add(double num1, double num2) {
        return num1 + num2;
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    double division(double num1, double num2) {
        if(num2 ==0){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return num1 / num2;
    }
}
