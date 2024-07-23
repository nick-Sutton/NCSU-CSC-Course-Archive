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
    private double[] polyArray;
    private int coefficientCounter;

    /**
     * A constructor that initializes all instance varaibles. The coefficent array(polyArray)
     * is initialized to a length of 10. The portion of the array that is filled 
     * is maintained by the coefficentCounter varaible.
     */
    public Polynomial() {
        polyArray = new double[10];
        coefficientCounter = 0; // Begins counting how much of the poly array is filled
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
     * (4.0 x^3 - 0.2 x^1 + 2.2 x^0)
     * When coefficents are negative the sign is replaces with (-)
     * When coefficents are positive the sign is replaced with (+)
     * @return String representatioin of the coefficent array.
     */
    public String toString() {

        return Double.toString(polyArray.length - 1) + " x^" + Double.toString(3);
    }

    /** 
     * Locates and returns the double value of the polynomial at a location (x).
     * @return double value of polygon at location x.
     */
    public double getValue(double x) { //Done
        double value = 0;

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
     *         For roots between bounds of twp different signs return 0,
     *         For roots between bounds or with even sign changes return -2.
    */
    public int findRoot(double lower, double upper) {
        return 1;
    }
}