package in.practice.utils;

import in.practice.geometry.Circle;
import in.practice.geometry.Rectangle;
//import in.practice.geometry.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Circle cir = new Circle(7.8);
        Rectangle rect = new Rectangle(18,5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of the circle is: %f, Area of the rectangle is: %f", cirArea,rectArea);
    }
}
