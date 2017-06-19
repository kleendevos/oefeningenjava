package be.vdab.shapes;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class Shape {

    private String color;
    private Boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }


    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor (){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + color + ", and " + filled ;
    }
}
