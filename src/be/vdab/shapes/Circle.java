package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Circle extends Shape{

    private double radius = 1.0;

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public Circle (double radius) {
        super();
        this.radius = radius;
    }

    public Circle () {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        double Area = 2*radius*3.14;
    }

    public void getPerimeter() {
        double perimeter = Math.pow(radius,2)*3.14;
    }

    @Override
    public String toString() {
        return "A Circle with radius " + radius + ", which is a sublass of " + Shape.class + '\n';    }
}
