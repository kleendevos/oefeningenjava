package be.vdab.animals;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public class animal {
    private String name;

    public animal (String name) {
        this.name =name;
    }

    public animal() {

    }

    public void sound() {
        System.out.println ("miep");

    }
    //declaratie maar geen invulling zodanig dat subclasse verplicht wordt gemaakt!
    // kan ook standaard gesteld worden door accolades in te vullen met.
    // system.out.println ("invulling") dan zullen alle andere dieren standaard deze invulling krijgen tenzij ergens
    // anders vermeld.

}
