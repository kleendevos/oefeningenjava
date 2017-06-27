package be.vdab.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthdayPrediction {

    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Wanneer ben je Jarig?");



        LocalDate today = LocalDate.now();
        String birthday = s.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateTime = LocalDate.parse(birthday,formatter);

        System.out.println(dateTime);






        LocalDate nextBirtday = dateTime.withYear(today.getYear());

        if (nextBirtday.isBefore(today) || nextBirtday.isEqual(today)) {
            nextBirtday = nextBirtday.plusYears(1);
        }

        Period p = Period.between(today, nextBirtday);
        long p2 = ChronoUnit.DAYS.between(today,nextBirtday);

        System.out.println ("There are " + p.getMonths() + " months and " + p.getDays() + " days until your next birtday or " + p2 + " days in total");
        System.out.println ("You will become " + (nextBirtday.getYear()-dateTime.getYear()));






    }
}
