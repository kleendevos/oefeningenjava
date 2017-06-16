package com.realdolmen.domain;
import java.util.Date;

/**
 * Created by kathleendevos on 16/06/17.
 */
public class TestAccountFriend {
    public static void main (String [] args){

        Account friend = new Account();
        friend.setId(500);
        friend.setBalance(2000);
        friend.setAnnualInterestRate(2);



        System.out.println("ID: "  + friend.getId());
        System.out.println("BALANCE: "  + friend.getBalance());
        System.out.println ("ANNUAL INTEREST RATE:" + friend.getAnnualInterestRate());
        System.out.println ("DATE CREATED: "+ friend.getDateCreated());



        Address friendadres1 = new Address();
        friendadres1.setStreet("Dutselstraat");
        friendadres1.setNumber("57");
        friendadres1.setPostalCode("3220");
        friendadres1.setCity("Holsbeek");
        friendadres1.setCountry("BELGIUM");
        friendadres1.setActive(true);

        System.out.println(friend.getId());
        System.out.println(friendadres1.getStreet() + " " + friendadres1.getNumber());
        System.out.println (friendadres1.getPostalCode()+" "+ friendadres1.getCity());
        System.out.println(friendadres1.getCountry());
        System.out.println (friendadres1.isActive());



    }

}
