
public class Beehive {
    public static void main(String[] args) {

        Beeworker w1 = new Beeworker("maya", 100, 0); //wat volgt op new is constructor - geen parameters = DEFAULT
        Beeworker w2 = new Beeworker("jimi", 75, 0);
        Beeworker w3 = new Beeworker("amy", 50, 0);

        System.out.println(w1.getCapacity());

        while (w1.gatherNectar(5)) {
            System.out.println("Visit new Flower");
        }


        Beequeen q = new Beequeen();

        while (q.layeggs(10)) {
            System.out.println("lay other egg");
        }

        Beeflower f = new Beeflower("Rose");
        Beeflower f2 = new Beeflower("Tullip");
        Beeworker w4 = new Beeworker("Kanye", 100, 0);

        while (f.flowerworks()) {
            while (w4.gatherNectarFlower(1)) {
            }





        }
        System.out.println(w4.name + " needs to go to " + f2.name);
    }
}
