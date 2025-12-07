package day01.basics;

public class PatternPrinter {
    public void printRectangle(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Right Triangle
    public void printRightTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println("*".repeat(i + 1));
        }
        System.out.println();
    }

    //Claude
    public void otherRightTriangle(int rows) {
        System.out.println("--- Right Triangle Pattern (" + rows + " rows) ---");

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void InverseRightTriangle(int rows) {
        System.out.println("====Inverse Right Angled Triangle===");

        for (int i = 0; i < rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Claude
    public void printInvertedTriangle(int rows) {
        System.out.println("--- Inverted Triangle Pattern (" + rows + " rows) ---");

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Pattern 4: Pyramid (Centered Triangle)
     * Example output (5 rows):
     * *
     * **
     * ***
     * ****
     * *****
     *
     * @param rows number of rows
     */

    public void pyramid(int rows) {
        System.out.println("====pyramid====");

        for (int i = 1; i <= rows; i++) {

            for (int j = 0; j < (rows - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern 5: Diamond
     * Example output (5 rows):
     * *
     * ***
     * *****
     * ***
     * *
     *
     * @param rows half-height of diamond (must be odd for symmetry)
     */

    public void printDiamond(int rows) {
        System.out.println("--- Diamond Pattern (" + rows + " rows) ---");

        //Upper Half (Including Middle Part) -> Ascending order
        //row - i for spaces -> 4,3,2,1,0
        //2(i) - 1 for stars -> 1,3,5,7,9

        for (int i = 1; i <= rows - 1; i++) {
            //for spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half -> Descending Order
        //row -i for spaces -> 1,2,3,4 (don't include 0)
        //2(i) - 1 for stars -> 7,5,3,1

        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Pattern 6: Hollow Rectangle
     * Example output (5x7):
     * *******
     * *     *
     * *     *
     * *     *
     * *******
     *
     * @param rows number of rows
     * @param cols number of columns
     */
    public void printHollowRectangle(int rows, int cols) {
        System.out.println("===Hollow Rectangle===");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void printNumberTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printMultiplicationTable(int size) {
        System.out.println("=== Multiplication Table===");
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%d ", i * j);
            }
            System.out.println();
        }
    }
}