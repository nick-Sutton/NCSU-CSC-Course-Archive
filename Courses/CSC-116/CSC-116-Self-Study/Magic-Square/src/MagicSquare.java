package src;

import java.util.Arrays;

public class MagicSquare {
    
    private int[][] squareArray;
    private int column;
    private int row;

    public MagicSquare() {

    }

    public void setSquareSize(int squareSize) {
        squareArray = new int[squareSize][squareSize];
    }

    public void computeSquare() {
        column = squareArray.length / 2;
        row = 0;

        squareArray[row][column] = 1;

        for (int i = 0; i > 2 && i < squareArray.length; i++) {
            squareArray[i][i] = i + 1;
        }
        System.out.println(Arrays.deepToString(squareArray)); 
    }

    public String toString() {
        for (int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
                System.out.print(squareArray[i][j]);
            }
            System.out.println();
        }
        return "Hello";
    }
}
