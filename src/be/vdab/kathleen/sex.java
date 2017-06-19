package be.vdab.kathleen;

public enum sex {

        MALE ("man"), FEMALE ("vrouw"), OTHER ("other");

        private String name;

        private sex(String name) {
            this.name = name;

        }

        public String getName(){
            return name;

        }



}

/*
 public class sex {
    public static final sex male = new sex ("male");
    public static final sex female = new sex ("female");
    public static final sex other = new sex ("other");


    private String sex;

    private sex (String name) {
    this.name = name;

    public String getName () {
    return name;


    }
}
        )
*/