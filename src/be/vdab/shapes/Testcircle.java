package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class Testcircle {
    public static void main (String [] args){

        Circle c = new Circle(10.0);

        c.calculatePerimeter();
        c.calculateArea();

        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());

    }

}
