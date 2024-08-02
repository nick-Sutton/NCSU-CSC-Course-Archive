# [Files](https://github.com/nick-Sutton/NCSU-CSC-Course-Archive/tree/main/Courses/CSC-116/CSC-116-Self-Study/Line-Class)
# BJP5 Exercise 8.14: classLine
Write a class called `Line` that represents a line segment between two `Point`s. Your `Line` objects should have the following methods:

Source: [Practice-it](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e14%2DclassLine)

### `public Line(Point p1, Point p2)`
Constructs a new line that contains the given two points.

### `public Point getP1()`
Returns this line's first endpoint.

### `public Point getP2()`
Returns this line's second endpoint.

### `public String toString()`
Returns a string representation of this line, such as `"[(22, 3), (4, 7)]"`.

# BJP5 Exercise 8.15: getSlopeLine
Add the following method to your Line class from the previous exercise:

Source: [Practice-it](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e15%2DgetSlopeLine)

### `public double getSlope()`
Returns the slope of this line. The slope of a line between points $(x_1, y_1)$ and $(x_2, y_2)$ 
is equal to $\(\frac{y_2 - y_1}{x_2 - x_1}\)$. If the two points have the same x-coordinates, the denominator 
is zero, and the slope is undefined, so you should throw an `IllegalStateException` in this case.

# BJP5 Exercise 8.16: constructorLine
Add the following constructor to your Line class from the preceding exercises:

Source: [Practice-it](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e16%2DconstructorLine)

### `public line(int x1, int y1, int x2, int y2)`
Constructs a new line that contains the given two points.

# BJP5 Exercise 8.17: isCollinearLine
Add the following method to your Line class:

Source: [Practice-it](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e17%2DisCollinearLine)

### `public boolean isCollinear(Point p)`
Returns true if the given point is collinear with the points of this line; that is, if, 
when this Line is stretched infinitely, it would eventually hit the given point. Points 
are collinear if a straight line can be drawn that connects them. Two basic examples are 
three points that have the same x- or y-coordinate. The more general case can be determined 
by calculating the slope of the line between each pair of points and checking whether this 
slope is the same for all pairs of points. Use the formula $\(\frac{y_2 - y_1}{x_2 - x_1}\)$ to determine 
the slope between two points $(x_1, y_1)$ and $(x_2, y_2)$.
