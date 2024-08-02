package src;

import java.util.Scanner;

/**
 * CSC 116 Self Study - Magic Square 
 * @author Nicholas Sutton
 * 
 * The Magic Square class creates an odd-sized sqaure of numbers.
 * The sqaure contains consecutive numbers, such that the numbers
 * in the rows, columns, and the numers in the diagonals add up
 * to the same sum.
 */

 /**
  * 
  */
 public class MagicSquareUI {

    private MagicSquare magicSquare;

    private Scanner scanner;

    private String inputSize;

    public MagicSquareUI() {
        scanner = new Scanner(System.in);
        magicSquare = new MagicSquare();
    }

    public void runMagicSquare() {
        System.out.println("----------<Magic Number Program>----------");

        setMagicSquare();

        printMagicSquare();

        scanner.close();
    }

    public void setMagicSquare() {
        System.out.println("Enter an odd size for the magic square: ");

        while(true) {
            inputSize = scanner.next();

            try {
                int squareSize = Integer.parseInt(inputSize);
                magicSquare.setSquareSize(squareSize);
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again.");
            }
        }

        magicSquare.computeSquare();
        
        System.out.println("");
    }

    public void printMagicSquare() {
        System.out.println(inputSize + "X" + inputSize + " Magic Square");
        System.out.println("-----------------");
        System.out.println(magicSquare.toString());
    }

    public static void main(String[] args) {
        MagicSquareUI magicSquareUI = new MagicSquareUI();
        magicSquareUI.runMagicSquare();
    }
 }