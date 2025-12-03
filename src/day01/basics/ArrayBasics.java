package day01.basics;

public class ArrayBasics {

    // Declare and Specify length
    int[] numbs = new int[5];

    //Declare and assign values
    int[] scores = {10, 20, 30, 40, 50};

    int[][] matrix = {
            {1, 2, 3},
            {2, 3, 4},
            {3, 4, 5}
    };

    public ArrayBasics() {
        //Modifying Elements
        scores[0] = 100;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    //length
    public void showLength() {
        System.out.println("Length: " + scores.length);
    }

    //access values
    public void showElements() {
        for (int score : scores) {
            System.out.println("Scores array: " + score);
        }
    }

    public void displayArray() {
        for (int numb : numbs) {
            System.out.println("Numbers array:" + numb);
        }
    }
}

