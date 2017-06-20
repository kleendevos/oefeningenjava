package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Rectangle extends Shape {

    public double width;
    public double length;


    public Rectangle() {

    }

    public Rectangle (double width, double length) {
        super();
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, String color, boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = 2*(length + width) ;
        return area;
    }

    public double getPerimeter() {
        double perimeter = length*width ;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle with "+ width + " and length" + length + "and witch is a subclass of " + Shape.class + '\n';

    }
}
