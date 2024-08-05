/**
 * CSC 116 Self Study - Point Class
 * @author Nicholas Sutton
 * From - Practice-it at Udub
 * 
 *
 */

public class Point {
    int x;
    int y;

    public Point(int initialX, int initialY) {
        this.x = initialX;
        this.y = initialY;
    }

    public Point(Point otherPoint) {
        this.x = otherPoint.x;
        this.y = otherPoint.y;
    }

    public double distance(Point other) {
        double distance = Math.sqrt(Math.pow(this.x - other.x,2) + Math.pow(this.y - other.y ,2));
        return distance;
    }

    public String toString() {
        return "x=" + x + ",y=" + y;  
    }

    public void setX(int newX) {
        this.x = newX;
    }

    public void setY(int newY) {
        this.y = newY;
    }

    public int quadrant() {
        if (this.x > 0 && this.y > 0) {
            return 1;
        } else if (this.x < 0 && this.y > 0) {
            return 2;
        } else if (this.x < 0 && this.y < 0) {
            return 3;
        } else if (this.x > 0 && this.y < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    public void flip() {
        int flippedX = -this.y;
        int flippedY = -this.x;
        this.x = flippedX;
        this.y = flippedY;
    }

    public int manhattanDistance(Point other) {
        return Math.abs(other.x - this.x) + Math.abs(other.y = this.y);
    }

    public boolean isVertical(Point other) {
        if (other.x == this.x) {
            return true; 
        } else {
            return false;
        }
    }

    public double slope(Point other) {
        double slope = 0;
        try {
            slope = Double.valueOf((other.y - this.y) / (other.x - this.x));
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }

        return slope;
    }

    public boolean isCollinear(Point p1, Point p2) {
        if (p1.x == this.x || p2.x == this.x) {
            return true;
        } 

        double slope1 = (p1.y = this.y) / (p1.x - this.y);
        double slope2 = (p2.y = this.y) / (p2.x - this.x);

        if (slope1 == slope2) {
            return true;
        } else {
            return false;
        }
    }
}
