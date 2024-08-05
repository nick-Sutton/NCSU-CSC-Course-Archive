import java.util.Scanner;

/**
 * CSC 116 Self Study - Two Rectangles
 * @author Nicholas Sutton
 * From - Practice-it at Udub
 * 
 * The Two Square class creates an two constants and uses them to print square.
 */

public class PointUI {
    Point point;
    Point otherPoint;
    Scanner scanner;

    public PointUI() {
        this.scanner = new Scanner(System.in);
    }

    public void runPointUI() {
        System.out.println("----------Point Program----------");
        System.out.print("Enter an x value: ");
        int xValue = Integer.parseInt(scanner.next());
        
        System.out.print("Enter an y value: ");
        int yValue = Integer.parseInt(scanner.next());

        point = new Point(xValue, yValue);
        System.out.println(point.toString());

        System.out.println("The flipped version of this point is: ");
        point.flip();
        System.out.println(point.toString());

        System.out.println("Please pick another point");
        System.out.print("Enter another x value: ");
        int otherX = Integer.parseInt(scanner.next());
        
        System.out.print("Enter another y value: ");
        int otherY = Integer.parseInt(scanner.next());

        otherPoint = new Point(otherX, otherY);

        point = new Point(otherPoint);
        System.out.println(point.toString());
        System.out.println("The flipped version of this point is: ");
        point.flip();
        System.out.println(point.toString());

        int pointQuad = point.quadrant();
        if (pointQuad == 0) {
            System.out.println("This point lies on one of the axes");
        } else {
            System.out.println("This point lies in quadrant " + pointQuad);
        }



        System.out.println("Please choose a new point");
        System.out.print("Enter an x value: ");
        int newX = Integer.parseInt(scanner.next());
        point.setX(newX);

        System.out.print("Enter an y value: ");
        int newY = Integer.parseInt(scanner.next());
        point.setY(newY);

        System.out.println("Your new point is " + point.toString());
        int newPointQuad = point.quadrant();
        if (newPointQuad == 0) {
            System.out.println("This point lies on one of the axes");
        } else {
            System.out.println("This point lies in quadrant " + newPointQuad);
        }


        scanner.close();

    }

    public static void main(String[] args) {
        PointUI pointUI = new PointUI();
        pointUI.runPointUI();
        
    }
}
