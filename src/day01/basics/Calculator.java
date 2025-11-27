package day01.basics;

public class Calculator {

    //Public Methods
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //Modified Method with validation
    public double division(double num1, double num2) {
        if (!isValidDivisor(num2)) {
            return 0;
        }
        return num1 / num2;
    }

    //Private Method
    private boolean isValidDivisor(double divisor) {
        if (divisor == 0) {
            System.out.println("Error: Divisor cannot be zero!");
            return false;
        }
        return true;
    }

    private boolean isPositive(double num) {
        return num > 0;
    }

    private boolean isInRange(double num, double min, double max) {
        return num >= min && num <= max;
    }

    public double absoluteValue(double num) {
        if (num < 0) {
            return num * -1;
        }
        return num;
    }

    public double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public double power(double num, int power) {
        return Math.pow(num, power);
    }
}
