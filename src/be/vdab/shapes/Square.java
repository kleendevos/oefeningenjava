package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Square extends Rectangle {



   public Square (double side,String color, boolean filled){
        super(side,side);
    }

    public Square (double side){
        super(side,side);
    }

   public double getside () {
        return getWidth();
    }


    public void setside (double side) {
       setWidth(side);
       setLength(side);

    }


    public String toString() {
        return "A Square with side " + width + ", which is a subclas of " + Rectangle.class + '\n';
    }
}
