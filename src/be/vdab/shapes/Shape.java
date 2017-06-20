package be.vdab.shapes;

public class Shape {

    private String color;
    private Boolean filled;

    public Shape() {
        this("red", true);
        //je kan de grote constructor gebruiken om deze in te vullen!
        // kan ook this.color = red en this.filled = true
        }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }


    public String toString() {
        return "A Shape with color of " + color + ", and " + (filled? "not " : "") + "filled in" + '\n';
    }



}
