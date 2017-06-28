package be.vdab.Driverexam;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by vdabcursist on 28/06/2017.
 */
public class StudentAttempt {
    private String name;

    private Map<Integer, Character> studentAnswers = new TreeMap<>();

    public StudentAttempt(String name) {
        this.name = name;
    }

}
