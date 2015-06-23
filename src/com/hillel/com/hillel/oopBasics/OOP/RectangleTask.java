package com.hillel.com.hillel.oopBasics.OOP;

/**
 * Created by Влад on 14.06.2015.
 */
public class RectangleTask {
    /*public static void main(String[] args) {

        //resolve();

    }

    public RectangleTask(double p, double s) {

    }*/

    public static RectangleOOP getRectangle(double l, double w) {
        if (hasSolution(l,w) == false)
            return null;
        else return new RectangleOOP(l,w);
    }

    public static boolean hasSolution(double l, double w) {
        double p = 2*(l+w);
        double s = l*w;
        if (Math.pow(p / 2, 2) - 4 * s < 0)
            return false;
        else return true;
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
