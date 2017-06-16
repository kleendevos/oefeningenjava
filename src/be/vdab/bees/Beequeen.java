package be.vdab.bees;

/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Beequeen {

    private int hunger = 100;
    private int power = 100;
    private int eggslayed = 0;
    private int procentpower = power - eggslayed;

    public Beequeen() {
        this.hunger = hunger;
        this.power = power;
        this.eggslayed = eggslayed;
        this.procentpower = procentpower;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean layeggs(int amount) {

        System.out.println("The Queen is working hard");
        eggslayed += amount;

        if (eggslayed == power) {
            System.out.println("The Queen has no power left - she must refill");
            return false;

        } else {
            System.out.println("After Laying" + eggslayed+ "The Queen has  " + (power - eggslayed) + " procent power left");
            return true;
        }
    }


}



