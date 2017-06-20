package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Square extends Rectangle {



   public Square (double side){
        this.width = side;
        this.length = side;
    }

    public Square (double width, String color, boolean filled){
       super(width,color,filled);

    }

    public double getside () {
        return getWidth();
    }


    public void setside (double side) {
       double width = side;
       double length =side;

    }

    @Override
    public String toString() {
        return "A Square with side " + width + ", which is a subclas of " + Rectangle.class + '\n';
    }
}
