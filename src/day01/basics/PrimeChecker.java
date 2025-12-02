package day01.basics;

public class PrimeChecker {
    public boolean isPrime(int num) {
        if (!isValidInput(num)) {
            return false;
        }
        if (isEven(num) && num != 2) {

            return false;
        }
        return !hasOddDivisors(num);
    }

    private boolean isValidInput(int num) {
        if (num < 2) {
            System.out.println("Input should be greater than 2.");
            return false;
        }
        return !hasOddDivisors(num);
    }

    private boolean isEven(int num) {
        return num % 2 == 0;
    }

    private boolean hasOddDivisors(int num) {
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                System.out.println(num + " is divisible by " + i);
                return true;
            }
        }
        return false;
    }
}
