package be.vdab.Driverexam;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class Driverexam {
    private Map<Integer, Character> answers = new TreeMap <> ();

    private Collection <StudentAttempt> attempts = new TreeSet<StudentAttempt>();


    public Driverexam () {
        answers.put(1,'B');
        answers.put(2,'D');
        answers.put(3,'A');
        answers.put(4,'B');
        answers.put(5,'B');
        answers.put(6,'B');
        answers.put(7,'B');
    }

}
