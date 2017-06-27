package be.vdab.JavaCollectionsFrameworks.Oefening13_1;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class Point implements Comparable<Point> {

    private double x;
    private double y;

    Point(double x, double y){
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
        return "(" + "x= " + String.format("%.2f",x) + " and " + "y= " + String.format("%.2f",y) + ")";

    }

    public int compareTo (Point point){
        if (x==point.getX()){
            if (y > point.getY())
                return 1;
            else if (y < point.getY())
                return -1;
            else
                return 0;
        }
        else if (x > point.getX())
            return 1;
        else
            return -1;
    }




}
