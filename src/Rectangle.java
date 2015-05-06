import java.util.Scanner;

/**
 * Created by Влад on 05.04.2015.
 */
public class Rectangle {
    public static void main(String[] params) {
        double p;
        double s;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert P: ");
        p = in.nextDouble();
        System.out.print("Insert S: ");
        s = in.nextDouble();
        resolve(p, s);
    }
    public static void resolve(double p, double s) {
        double x;
        double y;
        double d = Math.pow(p / 2, 2) - 4 * s;
        if (d > 0) {
            x = ((p / 2) + Math.sqrt(d)) / 2;
            y = ((p / 2) - Math.sqrt(d)) / 2;
            System.out.println("width = " + x + "\nheight = " + y);
        } else if (d == 0) {
            x = (p / 2) / 2;
            y = x;
            System.out.println("length = " + y);
            System.out.println("width = " + x);
        } else {
            System.out.println("Equation has no solution!");
        }
    }

}