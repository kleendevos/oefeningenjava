package com.realdolmen.domain;

/**
 * Created by kathleendevos on 16/06/17.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String birthDate;
    private String salary;
    private String email;

    public Employee(String firstName, String lastName, String birthDate, String salary, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.salary = salary;
        this.email = email;
    }

    @Override
    public String toString() {
        return firstName + "\t"+ lastName + "\t"+ birthDate + "\t"+  salary  + "\t"+ email+ "\n";
    }
}
