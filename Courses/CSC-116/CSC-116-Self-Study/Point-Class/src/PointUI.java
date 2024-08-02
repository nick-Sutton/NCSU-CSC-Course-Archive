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

        int pointQuad = point.quadrant();
        if (pointQuad == 0) {
            System.out.println("This point lies on one of the axes");
        } else {
            System.out.println("This point lies in quadrant " + pointQuad);
        }

        System.out.println("Would you like to change the point: (Y/N)");
        String changePoint = scanner.nextLine();

        if (changePoint.equalsIgnoreCase("y")) {
            System.out.print("Enter an x value: ");
            xValue = Integer.parseInt(scanner.next());
            
            System.out.print("Enter an y value: ");
            yValue = Integer.parseInt(scanner.next());
        }

        scanner.close();

    }

    public static void main(String[] args) {
        PointUI pointUI = new PointUI();
        pointUI.runPointUI();
        
    }
}
