package be.vdab.bees;

/**
 * Created by vdabcursist on 19/06/2017.
 */
public abstract class bee { //abstract laat niet toe om een bee-klasse aan te maken zonder deze in de onderliggende klasse aan te maken
    protected String name; //private behalve voor subclasse!

    public bee (String name) {
        this.name=name;
    }

    public void fly() {
        System.out.println ("Bee is flying around");


    }

    public String getName (){
        return name;
    }
}
