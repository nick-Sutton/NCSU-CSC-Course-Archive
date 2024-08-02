# [Files](https://github.com/nick-Sutton/NCSU-CSC-Course-Archive/tree/main/Courses/CSC-116/CSC-116-Self-Study/Point-Class)

# BJP5 Self-Check 8.5 classPoint
Write a class called `Point` that represents a point in space:

```plain text 
public class Point {
  int x;
  int y;

  // Your Code Here
}
```

# BJP5 [Self-Check 8.10: distancePoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/s10%2DdistancePoint)
Add the following method to the Point class:

### `public double distance(Point other)`
Returns the distance between the current Point object and the given other Point object. 
The distance between two points is equal to the square root of the sum of the squares of 
the differences of their x- and y-coordinates. In other words, the distance between two points 
$(x_1, y_1)$ and $(x_2, y_2)$ can be expressed as the square root of $(x_2 - x_1)^2 + (y_2 - y_1)^2$. Two points
with the same (x, y) coordinates should return a distance of 0.0.

```plain text 
public class Point {
  int x;
  int y;

  // Your Code Here
}
```

# BJP5 [Self-Check 8.14: toStringPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/s14%2DtoStringPoint)

Add the following method to the Point class:

### `public String toString()`
Make it return a string in the following format. For example, if a Point object stored in a 
variable pt represents the point (5, -17), return the string:
```plain text
java.awt.Point[x=5,y=-17]
```

# BJP5 [Self-Check 8.18: constructorPointErrors](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/s18%2DconstructorPointErrors)

The following constructor has two major problems. What are they? Find and fix the problems, 
and submit a working version of the code.

```plain text 
public class Point {
  int x;
  int y;

  // Your Code Here
}
```

# BJP5 [Self-Check 8.21: constructorPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/s21%2DconstructorPoint)
Add a constructor to the Point class that accepts another Point as a parameter 
and initializes the new Point to have the same (x, y) values. Use the keyword this in your solution.

```plain text 
public class Point {
  int x;
  int y;

  // Your Code Here
}
```

# BJP5 [Self-Check 8.25: setXYPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/s25%2DsetXYPoint)

Add methods named setX and setY to the Point class. Each method accepts an integer parameter
and changes the Point object's x- or y-coordinate to be the value passed, respectively.

```plain text 
public class Point {
  int x;
  int y;

  // Your Code Here
}
```

# BJP5 [Exercise 8.1: quadrantPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e1%2DquadrantPoint)
Add the following method to the Point class:

### `public int quadrant()`
Returns which quadrant of the x/y plane this Point object falls in. Quadrant 1 contains 
all points whose x and y values are both positive. Quadrant 2 contains all points with negative x 
but positive y. Quadrant 3 contains all points with negative x and y values. Quadrant 4 contains all 
points with positive x but negative y. If the point lies directly on the x and/or y axis, return 0.

# BJP5 [Exercise 8.2: flipPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e2%2DflipPoint)
Add the following method to the Point class:

### `public void flip()`
Negates and swaps the x/y coordinates of the Point object. For example, if the object initially represents the 
point (5, -3), after a call to flip, the object should represent (3, -5). If the object initially represents the 
point (4, 17), after a call to flip, the object should represent (-17, -4).

# BJP5 [Exercise 8.3: manhattanDistancePoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e3%2DmanhattanDistancePoint)
Add the following method to the Point class:

### `public int manhattanDistance(Point other)`
Returns the "Manhattan distance" between the current Point object and the given other Point object. 
The Manhattan distance refers to how far apart two places are if the person can only travel straight 
horizontally or vertically, as though driving on the streets of Manhattan. In our case, 
the Manhattan distance is the sum of the absolute values of the differences in their coordinates; in other words, 
the difference in x plus the difference in y between the points.

# BJP5 [Exercise 8.4: isVerticalPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e4%2DisVerticalPoint)
Add the following method to your Point class:

### `public boolean isVertical(Point other)`
Returns true if the given Point lines up vertically with this Point; that is, if their x coordinates are the same.

# BJP5 [Exercise 8.5: slopePoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e5%2DslopePoint)
Add the following method to the Point class:

### `public double slope(Point other)`
Returns the slope of the line drawn between this Point and the given other Point. 
Use the formula $\(\frac{y_2 - y_1}{x_2 - x_1}\)$ to determine the slope between two points $(x_1, y_1)$ and $(x_2, y_2)$. 
Note that this formula fails for points with identical x-coordinates, so throw an IllegalArgumentException in this case.

# BJP5 [Exercise 8.6: isCollinearPoint](https://practiceit.cs.washington.edu/problem/view/bjp5/chapter8/e5%2DslopePoint)
Add the following method to the Point class:

### `public boolean isCollinear(Point p1, p2)`
Returns whether this Point is collinear with the given two other points. Points are collinear 
if a straight line can be drawn that connects them. Two basic examples are three points that 
have the same x- or y-coordinate. The more general case can be determined by calculating the slope
of the line between each pair of points and checking whether this slope is the same for all pairs of points. 
Use the formula $\(\frac{y_2 - y_1}{x_2 - x_1}\)$ to determine the slope between two points $(x_1, y_1)$ and $(x_2, y_2)$. 
(Note that this formula fails for points with identical x-coordinates so this will have to be special-cased in your code.)

Since Java's double type is imprecise, round all slope values to a reasonable accuracy such as four digits 
past the decimal point before you compare them.


