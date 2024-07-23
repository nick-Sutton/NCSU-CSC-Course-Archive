# Polynomial Assignment

In this Assignment you will learn a method for manipulating polynomials: computing values at various points, computing differences over an interval, and finding roots.

## Program Requirements

Your program will begin by printing the message **"Type in the polynomials in increasing powers:"**. It will then read a sequence of floating-point numbers, one per line, ending with a blank line. These numbers define a polynomial

$a_0 x^0 + a_1 x^1 + \ldots + a_{n-1} x^{n-1} = y$

where $a_0, a_1, \ldots, a_{n-1}$ are the \(n\) input numbers provided by the user. The polynomial's coefficient input is stopped by the user entering a blank line.

If the user enters a non-double value for a polynomial's coefficient, the program should print `Invalid input, please try again.`, and wait for additional coefficient input or a blank line.

After the blank line, the program will print the polynomial in the following format:

$a_{n-1} x^{n-1} + \ldots + a_1 x^1 + a_0 x^0$

where $a_{n-1}, \ldots, a_0$ and $n-1$ are actual numbers and the +'s are replaced by –'s when the corresponding coefficients are negative. In other words, if you enter -3 and 2 for coefficients, your program should print $2 x^1 - 3 x^0$ instead of $2 x^1 + (–3) x^0$. Terms with coefficients of 0 should be omitted. If the coefficient associated with the highest power is negative, then the coefficient should be printed as follows: $-4 x^4$.

The program will then make a sequence of input requests, each having three parts. Each request looks like the following where the user response is in **red italics**:

**Type in the range:**
- **Lower Bound (double):** `start`
- **Upper Bound (double):** `end`
- **Number Of Intervals (int):** `intervals`

The input for the lower and upper bounds should be doubles. If the user enters a non-double value, the program should print **"Invalid input"**, and reprompt the user for the specific value. The input for the number of intervals should be an integer strictly greater than 0. If the user enters a non-integer value or if the input is less than or equal to 0, the program should print **"Invalid input"**, and reprompt the user for the specific value.

The input for the lower bound should be strictly less than the input for the upper bound. If the lower bound is greater than or equal to the upper bound, the program should print **"Invalid bounds"** and the user should be reprompted for the lower and upper bounds.

After each three-part request, the program will print a table. Each row of the table contains the following data:

- `x`: the current value of `x`
- `p(x)`: the value of the polynomial at `x`
- `diff(index)`: $`p(x) – p(x_prev)`$, where $`x_prev`$ is the previous value of `x` in the table.

The number of rows in the table is determined by the value of `intervals` as supplied by the user. The values of `x` for the rows are spaced evenly, starting with `lower` and ending with `upper`.

Anywhere that the polynomial has a root between two successive values of `p(x)` that are on opposite sides of the x-axis, your program will insert an extra line into the table between the successive values indicating that there is a root and give the two values of `x`. If the polynomial has a root at both of the values of `x` in the table, a line after the corresponding lower value table line and before the corresponding upper value table line indicates that this is so. Otherwise, if the polynomial has a root at only one of the values of the table, a line after the corresponding table line indicates that this is so. Each root should only be listed once.

When the table has been printed, your program will ask the user if they want another table with the message: **"Do you want to redefine your table? (Y/N)"**. If the user responds yes, (e.g., with a value of 'y' or 'Y'), the program will request a new set of range data and print the table appropriate for the new data. The request for the range data will be repeated after each table is printed until the user responds no (e.g., with a value of 'n' or 'N' or any other value that is not 'y' or 'Y') to the request for a new table.

A sample run of this program would be:

```plaintext
Type in the polynomials in increasing powers:
2.2
-.2
0
4

4.0 x^3 – 0.2 x^1 + 2.2 x^0 
Type in the range:
Lower Bound (double): -10
Upper Bound (double): 10
Number Of Intervals (int): 10

    index  p(index) diff(index)
  -10.000 -3995.800  2911.600
   -8.000 -2044.200  1951.600
   -6.000  -860.600  1183.600
   -4.000  -253.000   607.600
   -2.000   -29.400   223.600
Root found between -2.000 and 0.000
    0.000     2.200    31.600
    2.000    33.800    31.600
    4.000   257.400   223.600
    6.000   865.000   607.600
    8.000  2048.600  1183.600
   10.000  4000.200  1951.600 

Do you want to redefine your table? (Y/N)
y

Type in the range:
Lower Bound (double): -2
Upper Bound (double): 0
Number Of Intervals (int): 14

    index  p(index) diff(index)
   -2.000   -29.400     7.330
   -1.857   -23.050     6.350
   -1.714   -17.609     5.441
   -1.571   -13.008     4.601
   -1.429    -9.176     3.831
   -1.286    -6.044     3.132
   -1.143    -3.542     2.502
   -1.000    -1.600     1.942
   -0.857    -0.148     1.452
Root found between -0.857 and -0.714
   -0.714     0.885     1.033
   -0.571     1.568     0.683
   -0.429     1.971     0.403
   -0.286     2.164     0.193
   -0.143     2.217     0.053
   -0.000     2.200    -0.017
    OR ( -0.000 or 0.000 is OK for this line)
    0.000     2.200    -0.017 

Do you want to redefine your table? (Y/N)
n
