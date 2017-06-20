package be.vdab.shapes;

/**
 * Created by vdabcursist on 20/06/2017.
 */
public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle (double radius){
        super(radius);
    }

    @Override
    public void resize(int percentage) {
        System.out.println(percentage);
    }


}
