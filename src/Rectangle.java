import java.util.Scanner;

/**
 * Created by Влад on 05.04.2015.
 */
public class Rectangle {
    public static void main(String[] params) {
        double P;
        double S;
        Scanner in = new Scanner(System.in);
        System.out.print("Insert P: ");
        P = in.nextDouble();
        System.out.print("Insert S: ");
        S = in.nextDouble();
        resolve(P, S);
    }
    public static void resolve(double P, double S) {
        double x,y;
        double D = Math.pow(P / 2, 2) - 4 * S;
        if (D > 0) {
            x = ((P / 2) + Math.sqrt(D)) / 2;
            y = ((P / 2) - Math.sqrt(D)) / 2;
            System.out.println("width = " + x + "\nheight = " + y);
        } else if (D == 0) {
            x = (P / 2) / 2;
            y = x;
            System.out.println("length = " + y);
            System.out.println("width = " + x);
        } else {
            System.out.println("Equation has no solution!");
        }
    }

}