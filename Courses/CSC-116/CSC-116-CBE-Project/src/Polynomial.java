/**
 * CSC 116 - CBE Project
 * @author Nicholas Sutton
 * 7/23/2024 -> 7/30/2024
 * 
 * The Polynomial Class represents a polynomial object.
 * A Polynomial 10 or less has coefficeients that are stored in an array.
 * The class utalizes instance variables to store coefficents and the portion
 * of the coefficient array that is filled.
*/

public class Polynomial {

    /**
     * Array containing all the user entered coefficient values
     */
    private double[] polyArray;

    /**
     * Counts the portion of the array that is filled
     */
    private int coefficientCounter;

    /**
     * A constructor that initializes all instance varaibles. The coefficent array(polyArray)
     * is initialized to a length of 10. The portion of the array that is filled 
     * is maintained by the coefficentCounter varaible.
     */
    public Polynomial() {
        polyArray = new double[10];
        coefficientCounter = 0;
    }

    /**
     * Adds new coefficents to the coefficent array(polyArray). New coefficents
     * are added to the next unfilled slot and any coefficents that overfill
     * the array are ignored.
     * @param coefficient
     */
    public void addCoefficient(double coefficient) { //Done
        if (coefficientCounter < polyArray.length) {
            polyArray[coefficientCounter] = coefficient;
            coefficientCounter++;
        }
    }

    /**
     * Returns the coefficent array(polyArray)
     * @return array of double values
     */
    public double[] getPolynomial() { //Done
        return polyArray;
    }

    /**
     * Converts the coefficent array into a string representation.
     * (a_(n - 1) x^(n - 1)) + ... + a_1 x^1 + a0 x^0
     * When coefficents are negative the sign is replaces with (-)
     * When coefficents are positive the sign is replaced with (+)
     * @return String representatioin of the coefficent array.
     */
    public String toString() {

        // Create an empty String to build the equation
        String polyEquation = "";
        // Allows for first value to keep its sign
        boolean onFirstTerm = true;

        // Locates the value of a_(n - 1) in the array
        // a = coefficient and n = i
        for (int i = coefficientCounter - 1; i >= 0; i--) {
            double coefficient = polyArray[i];

            // If the coefficient is zero we skip it. 
            // Note 1e-9(0.000000001) is being used instead of zero(0) to account for floating point errors.
            if (Math.abs(coefficient) < 1e-9) {
                continue;
            }

            // Allows the first term in the equation to keep its sign(-/+)
            if (onFirstTerm) {
                onFirstTerm = false;
            } else { // For all other values determine of appropriate sign(-/+) based on value
                if (coefficient > 0) {
                    polyEquation += " + ";
                } else { // positive(+)
                    polyEquation += " - ";

                    coefficient = -coefficient;
                } // negative(-)
            }

            // Concatenates coefficient values with the proper x^i to create the polynomial equation
            polyEquation += coefficient + " x^" + i;
        }
        return polyEquation;
    }

    /** 
     * Locates and returns the double value of the polynomial at a location (x).
     * @return double value of polygon at location x.
     */
    public double getValue(double x) {
        double value = 0;

        //Solve the equation for each value in the coefficient array(polyArray)
        for (int i = 0; i < coefficientCounter; i++) {
            value += polyArray[i] * Math.pow(x, i);
        }
        return value;

    }

    /**
     * Calculates and returns an integer location of a root.
     * This calulation determines which bound(s) the root is at,
     * as well as if a root is between the values.
     * @return The integer value were a root is located.
     *         For lower bounds return -1,
     *         For upper bounds return 1,
     *         For both return 2,
     *         For roots between bounds of two different signs return 0,
     *         For roots between bounds or with even sign changes return -2.
    */
    public int findRoot(double lower, double upper) {

        double lowerValue = getValue(lower);// Get the value of the polynomial at the point lower
        double upperValue = getValue(upper);// Get the value of the polynomial at the point upper

        // Create bools to check if the two bounds = 0 Note 1e-9(0.000000001) is being used instead of zero(0) to account for floating point errors.
        boolean lowerRootCheck = Math.abs(lowerValue) < 1e-9;
        boolean upperRootCheck = Math.abs(upperValue) < 1e-9;

        // Check if both values are zero
        if (lowerRootCheck && upperRootCheck) {
            return 2;
        }

        // Check if lowerValue is zero
        if (lowerRootCheck) {
            return -1;
        }

        // Check if upperValue is zero
        if (upperRootCheck) {
            return 1;
        }

        // Checks if a sign change occures between the two values
        if ((lowerValue < 0 && upperValue > 0) || (lowerValue > 0 && upperValue < 0)) {
            return 0;
        }

        //Neither are roots.
        return -2;
    }
}