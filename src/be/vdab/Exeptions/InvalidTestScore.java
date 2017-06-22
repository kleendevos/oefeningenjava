package be.vdab.Exeptions;

/**
 * Created by kathleendevos on 21/06/17.
 */
 public class InvalidTestScore extends IllegalArgumentException {

    public InvalidTestScore(String message) {
        super(message);

    }

    public InvalidTestScore() {
    }
}



