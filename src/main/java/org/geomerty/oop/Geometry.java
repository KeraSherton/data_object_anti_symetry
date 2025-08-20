package org.geomerty.oop;

import org.geomerty.oop.shapes.Circle;
import org.geomerty.oop.shapes.Rectangle;
import org.geomerty.oop.shapes.Shapes;
import org.geomerty.oop.shapes.Triangle;

import java.util.List;


public class Geometry {

    public static void main(String[] args) {
        // TODO Implement calculation of square area using oop code. Top left: x = 2.5, y = 4.5; side = 3.
        Shapes square = new Rectangle(3, 3);
         System.out.println("Area of square is " + square.getArea());
        System.out.println("Perimeter of square is " + square.getPerimeter());
        // TODO Implement calculation of rectangle area using oop code. Top left: x = 10.0, y = 5.0; height = 4.0, width = 5.0;
        Shapes rectangle = new Rectangle(4, 5);
        System.out.println("Area of rectangle is " + rectangle.getArea());
        System.out.println("Perimeter of rectangle is " + rectangle.getPerimeter());
        // TODO Implement calculation of circle area using oop code. Center: x = 8.7, y = 4.0; radius = 6.3;
        Shapes circle = new Circle(6.3);
         System.out.println("Area of circle is " + circle.getArea());
        System.out.println("Perimeter of circle is " + circle.getPerimeter());
        Shapes triangle= new Triangle(3,4,5);
        System.out.println("Area of triangle is " + triangle.getArea());
        System.out.println("Perimeter of triangle is " + triangle.getPerimeter());

        List.of(square, rectangle, circle, triangle).forEach(System.out::println);
    }
}
