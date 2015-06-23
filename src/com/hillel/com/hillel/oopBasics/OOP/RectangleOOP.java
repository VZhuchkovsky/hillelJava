package com.hillel.com.hillel.oopBasics.OOP;

/**
 * Created by Влад on 14.06.2015.
 */
public class RectangleOOP {
    public static void main(String[] args) {
        RectangleOOP rectangleOOP = new RectangleOOP(4,4);
        //String rectangle = rectangleOOP.toString();
        String rectangle = toString(rectangleOOP);
        System.out.println(rectangle);
    }

    public double length;
    public double width;

    RectangleOOP(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public static String toString(RectangleOOP rectangleOOP){
        String rectangle = rectangleOOP.toString();
        return rectangle;
    }


    //RectangleOOP rectangle1 = new RectangleOOP(4,1);
    //RectangleOOP rectangle2 = new RectangleOOP(8,4);
    //RectangleOOP rectangle3 = new RectangleOOP(20,25);

}




