package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */

// associatie waarbij cirkel gebruikt wordt om cilinder te gebruiken

public class Cilinder {
    private double heigth;
    private Circle base;


    public Cilinder(double heigth, Circle base) {
        this.heigth = heigth;
        this.base = base;

    }

    public Cilinder (double heigth, double radius) {
        this.heigth = heigth;
        this.base = new Circle(radius);
    }

    private double volume (){
        return base.calculateArea()*heigth;
    }
}

