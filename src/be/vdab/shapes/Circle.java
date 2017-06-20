package be.vdab.shapes;

public class Circle extends Shape implements GeometricObject {

    protected double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public Circle (double radius) {
        super();
        this.radius = radius;
    }

    public Circle () {
        this (1);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "A Circle with radius " + radius + ", with color " + getColor() + "oppervlakte " + calculateArea()+'\n';    }

    @Override
    public double calculatePerimeter() {
        return 2*radius*3.14;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2)*3.14;
    }

}
