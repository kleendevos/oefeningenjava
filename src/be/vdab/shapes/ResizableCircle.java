package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle (double radius){
        super(radius);
    }

    @Override
    public double resize(int percentage) {
        return calculatePerimeter()-(calculatePerimeter()*(percentage/100.0));
    }

}
