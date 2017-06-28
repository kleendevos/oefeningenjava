package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class Point implements Comparable<Point> {

    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String tostring() {
        return "(" + "x= " +  x + " and " + "y= " + y + ")";

    }

    public int compareTo(Point that) {
        if (this.x != that.x) {
            return (int) (this.x - that.x);
        } else {
            return (int) (this.y - that.y);
        }
    }
}
