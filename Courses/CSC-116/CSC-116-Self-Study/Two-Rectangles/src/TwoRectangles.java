/**
 * CSC 116 Self Study - Two Rectangles
 * @author Nicholas Sutton
 * From - Practice-it at Udub
 * 
 * The Two Square class creates an two constants and uses them to print square.
 */

 public class TwoRectangles {

    /** Width of Rectangle */
    private static final int WIDTH = 7;

    /** Height of Rectangle */
    private static final int HEIGHT = 4;

    /** 
     * Draw two rectangles based on the value
     * of the width and height constants
     */
    public static void drawRectangles() {

        // Prints The first square
        for (int rows = 0; rows < HEIGHT; rows++) {
            for (int columns = 0; columns < WIDTH; columns++) {
                System.out.print("*");
            }
            // moves the print to the next line
            System.out.println();
        }

        // Prints the second square
        for (int rows = 0; rows < HEIGHT; rows++) {

            // prints the whitespace before the second square
            for (int columns = 0; columns < WIDTH; columns++) {
                System.out.print(" ");
            }

            //Prints the second square
            for (int columns = 0; columns < WIDTH; columns++) {
                System.out.print("*");

            }
            // moves the print to the next line
            System.out.println();
        }
    }

    /** 
     * Program entry point.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Draw the rectangles
        drawRectangles();
    }


 }