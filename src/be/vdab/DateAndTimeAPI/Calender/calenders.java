package be.vdab.DateAndTimeAPI.Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class calenders {


    public static void main(String[] args) {


        int month;
        int year;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter month: ");
        String monthText = in.next();

        System.out.print("Enter year: ");
        String yearText = in.next();

        try {

            month = Integer.parseInt(monthText);
            year = Integer.parseInt(yearText);


            if (month < 1 || month > 12)
                throw new Exception("Invalid index for month: " + month);

            printCalendarMonthYear(month, year);

        } catch (NumberFormatException e) {
           System.err.println("Numberat Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    private static void printCalendarMonthYear(int month, int year) {

        Calendar cal = new GregorianCalendar();

        cal.clear();
        cal.set(year, month - 1, 1);

        System.out.println('\n'	+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG,
                Locale.US) + " " + cal.get(Calendar.YEAR));

        int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);
        int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);


        printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
    }


    private static void printCalendar(int numberOfMonthDays, int firstWeekdayOfMonth) {


        int weekdayIndex = 0;


        System.out.println("Su"+ '\t'+ "Mo" + '\t'+"Tu" + '\t'+ "We" + '\t'+ "Th" + '\t'+ "Fr"+ '\t'+  "Sa");


        for (int day = 1; day < firstWeekdayOfMonth; day++) {
            System.out.print("    ");
            weekdayIndex++;
        }


        for (int day = 1; day <= numberOfMonthDays; day++) {

            System.out.print(day);


                    weekdayIndex++;

            if (weekdayIndex == 7) {

                weekdayIndex = 0;

                System.out.println();
            } else {

                System.out.print('\t');
            }
        }


        System.out.println();
    }
}
