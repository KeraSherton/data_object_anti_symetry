package org.geomerty.oop.shapes;

public class Rectangle implements Shapes {
//    public Point topLeft;
    public double height;
    public double width;

    public Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return height*2 + width*2;
    }
}
