package com.hillel.com.hillel.oopBasics.OOP;

/**
 * Created by Влад on 14.06.2015.
 */
public class RectangleTask {
    public static void main(String[] args) {

        //resolve();
    }

    public RectangleOOP getRectangle(double p, double s){
        if(hasSolution(p,s) == false)
        return null;
        else return resolve(p,s);
    }

    public boolean hasSolution(double p, double s){
        if(Math.pow(p/2,2) - 4*s < 0 )
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
