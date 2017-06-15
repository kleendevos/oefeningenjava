/**
 * Created by vdabcursist on 15/06/2017.
 */
public class Beeflower {

    private int nectarCapacity = 10;
    private int Thirstlevel;
    String name;

    Beeworker w4 = new Beeworker("Kanye",0,0);




    public Beeflower (String name){
        this.name = name;
    }

    public Beeflower() {

    }


    public boolean flowerworks (){
        nectarCapacity = nectarCapacity - 1;

        if(nectarCapacity<2){
            System.out.println(name +  " is thirsty and is in need of a rainy day");
            return false;

        } else {
            System.out.println (name + " is calling out for " + w4.name + " to share it's nectar. " + name + "'s nectar capacity is " + nectarCapacity);
            return true;
        }
    }

}
