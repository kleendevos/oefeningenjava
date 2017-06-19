package be.vdab.animals;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class dog extends animal {
    public dog (String name) {
        super (name);
    }

    @Override
    public void sound() {
        System.out.println ("Waf");
    }
}
