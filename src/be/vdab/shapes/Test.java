package be.vdab.shapes;

import be.vdab.animals.list;
import com.sun.javafx.collections.ArrayListenerHelper;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kathleendevos on 19/06/17.
 */
public class Test {
    public static void main (String [] args){

        ArrayList<Shape>a = new ArrayList<Shape>();{
            a.add(new Shape("red", true));
            a.add(new Shape ("blue", true));
            a.add (new Circle(4,"blue", true));
            a.add(new Square(10,"red",true));

        }

        System.out.println(a);


        Shape b = new Shape ("yellow", false);
        Circle rondje = new Circle(10);
        Square s = new Square(10);
        Rectangle r = new Rectangle(10,5);

        r.getPerimeter();
        r.getArea();

        System.out.println(r.getPerimeter() + "omtrek" + (r.getArea()));

        rondje.getArea();
        rondje.getPerimeter();


        ArrayList<Circle> c = new ArrayList<Circle>();{
            c.add (new Circle());
        }
        System.out.println(c);






        System.out.println (b);
        System.out.println (rondje);
        System.out.println (r);
        System.out.println (s);

}}
