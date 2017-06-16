package com.realdolmen.domain;

import java.util.ArrayList;

/**
 * Created by kathleendevos on 16/06/17.
 */
public class List {
    public static void main (String [] args){

        ArrayList<Employee>a = new ArrayList<Employee>();
        a.add(new Employee("Kathleen","Devos","23 september 78","1500","kleen.devos@gmail.com"));
        a.add(new Employee("Queen", "Bee", "22 oktober 99","100000", "nnnnn@gggg.be"));

        System.out.println(a);

    }
}
