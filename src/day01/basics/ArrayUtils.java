package day01.basics;

public class ArrayUtils {
    public int findMax(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Error: Array is Empty!");
            return Integer.MIN_VALUE;
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Error: Array is Empty!");
            return Integer.MAX_VALUE;
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public int calculateSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int average = 0;
        int sum = calculateSum(array);
        average = sum / array.length;
        return average;
    }

    public int findIndex(int[] array, int value) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int[] getReverseArray(int[] array) {
        int[] reversed = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }
}
