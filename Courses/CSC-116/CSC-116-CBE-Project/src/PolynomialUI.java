import java.util.Scanner;

/**
 * CSC 116 - CBE Project
 * @author Nicholas Sutton
 * 7/23/2024 -> 7/30/2024
 * 
 * The PolynomialUI class accepts user input and displays 
 * the return values of the Polynomial class.
 */

public class PolynomialUI {
    /** Polynomail class */
    private Polynomial polynomial;

    /** Scanner for user input */
    private Scanner scanner;

    /**Lower Bound of Table */
    private double lowerBound;

    /**Upper Bound of Table */
    private double upperBound;

    /**Interval of Table */
    private int intervalInput;

    /**
     * A constructor that initializes the Polynomial object
     * as well as other instance variables.
     */
    public PolynomialUI() {
        polynomial = new Polynomial();
        scanner = new Scanner(System.in);

        lowerBound = 0;
        upperBound = 0;
        intervalInput = 0;

    }

    /**
     * Program entry point.
     * @param args (command line arguments)
     */
    public static void main(String[] args) {
        PolynomialUI polynomialUI = new PolynomialUI();
        polynomialUI.runPolynomial();
        
    }

    /**
     * Controls the programs flow.
     */
    public void runPolynomial() {
        String redefTable = "y";

        // Get user input for polynomial coefficients
        setPolynomial();

        // Print mathematical representation of polynomial array
        printPolynomial();

        // Loop so that user can redefine table
        while (redefTable.equalsIgnoreCase("y")) {

            // Get user input for range of table
            setRange();

            // print the table 
            printTable();

            // Loop for input validation
            while (true) {
                System.out.println("Do you want to redefine your table? (Y/N)");
                redefTable = scanner.nextLine();
          
                // Checks if user has entered y or n
                if (redefTable.equalsIgnoreCase("y") || redefTable.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("ERROR! Entry must be Y or N. Try again.");
                }
            }
        }
        scanner.close();
    }   

    /**
     * Prompts the user for coeifficents. The inputs are double values.
     * All non double values entered by the user will re-prompt them for input.
     * All valid coeifficents are added to the Polynomial Object. 
     */
    public void setPolynomial() {
        System.out.println("Type in the polynomials in increasing powers: \n");

        while (true) {

            String userInput = scanner.nextLine();

            // End user imput if user enters blank space
            if (userInput.isBlank()) {
                break;
            }

            // Validate that userInput is a double value.
            try {
                Double coefficeientInput = Double.parseDouble(userInput);
                polynomial.addCoefficient(coefficeientInput); // Adds The coefficeient input to the coefficent array(polyArray)
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please try again.");
            }

        }
    }

    /**
     * Prints a visual representation of the polynomial.
     */
    public void printPolynomial() {
        System.out.println(polynomial.toString());
    }

    /**
     * Prompts user to enter the range of the polynomial table.
     * The bounds of the table are double values and the interval is an integer value.
     * If the user does not input the desired value types they are repromted
     * Futher, lower bound must be less than the upper bound and the interval must be greater than 0.
     */
    public void setRange() {
        // Reset instance variables 
        lowerBound = 0;
        upperBound = 0;
        intervalInput = 0;
        boolean isValid = false;

        while (!isValid) {

            // Reset bools for error checking
            boolean lowerIsDouble = false;
            boolean upperIsDouble = false;
            boolean intervalIsInt = false;

            System.out.println(""); //Two empty spaces above table for formatting.
            System.out.println("Type in the range: ");

            // Checks if the input for lowerBound is a valid double value
            while (!lowerIsDouble) {
                System.out.print("Lower Bound (Double): ");
                if (scanner.hasNextDouble()) {
                    lowerBound = scanner.nextDouble();
                    lowerIsDouble = true;
                } else {
                    System.out.println("ERROR! Invalid decimal value. Try again.");
                }
                scanner.nextLine();
            } // for lowerisDouble
            
            // Checks if the input for upperBound is a valid double value
            while (!upperIsDouble) {
                System.out.print("Upper Bound (Double): ");
                if (scanner.hasNextDouble()) {
                    upperBound = scanner.nextDouble();
                    upperIsDouble = true;
                } else {
                    System.out.println("ERROR! Invalid decimal value. Try again.");
                }
                scanner.nextLine();
            } // for upperIsDouble

            //Checks if the input for interval is a valid integer value
            while (!intervalIsInt) {
                System.out.print("Number of Intervals (int): ");
                if (scanner.hasNextInt()) {
                    intervalInput = scanner.nextInt();
                    intervalIsInt = true;
                } else {
                    System.out.println("ERROR! Invalid integer value. Try again.");
                }
                scanner.nextLine();
            } // for intervalIsInt

            //Checks the values against eachother as per the document specs
            if (lowerBound < upperBound && intervalInput > 0) {
                isValid = true;
            } else {
                System.out.println("ERROR! Please re-enter your inputs. Lower Bound must be less than Upper Bound and Intervals must be greater than 0.");
            }
        } // for isValid

    }

    /**
     * Creates a three column table containing index, value of the polynomial
     * at that index, and the difference between the current value and the value at the index. 
     * Between each index the method checks for roots. If a root is found at or between
     * two indexes a line in the table is created stating the location of the root.
     */
    public void printTable() {
        // Finds the interval to be used between each value of the table
        double tableInterval = (upperBound - lowerBound) / Double.valueOf(intervalInput);

        System.out.println("\n"); // Two empty spaces above table for formatting.
        System.out.printf("%9s %9s %9s\n", "index", "p(index)", "diff(index)");

        // Loop through the values to populate the table
        for (double i = 0; i <= intervalInput; i++) {
            double index = lowerBound + (i * tableInterval);

            // Solves the polynomial for the previous value
            double previousValue = polynomial.getValue(index - tableInterval);

            // Solves the polynomial for the current value
            double currentValue = polynomial.getValue(index);
            
            // Difference between the current value and previous value.
            double diffIndex = currentValue - previousValue;
            
            // Gets the return value of the polynomial.findRoot methodw
            int findRoot = polynomial.findRoot(index - tableInterval, index);
            
            // Checks the return value of polynomial.findRoot()
            if (findRoot == -1) {
                System.out.printf("Root found at %.3f\n", index - tableInterval);
            } // for -1

            // Checks the return value of polynomial.findRoot()
            if (findRoot == 1) {
                System.out.printf("Root found at %.3f", index);
            } // for 1

            // Checks the return value of polynomial.findRoot()
            if (findRoot == 2) {
                System.out.printf("Root found at %.3f and %.3f\n", index - tableInterval, index);
            } // for 2

            // Checks the return value of polynomial.findRoot()
            if (findRoot == 0) {
                System.out.printf("Root found between %.3f and %.3f\n",index - tableInterval, index);
            } // for 0

            // Prints the values for each column of the table
            System.out.printf("%9.3f %9.3f %9.3f\n", index, currentValue, diffIndex);

            // changes the previous values to the current value for the next iteration of the loop.
            previousValue = currentValue;
            
        } // Table Loop

        System.out.println("\n"); // Two empty spaces below table for formatting.
    }
}