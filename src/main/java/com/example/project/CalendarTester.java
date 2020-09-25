package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar();


        /* You can use constants with the GregorianCalendar class to refer to its various
         * variables.  For example, "Calendar.MONTH" is a variable that refers to the
         * month of the calendar.  This can be used with the .get() method to test
         * the calendar.  Consider the example:
         * */

        //Call the .get method on myCal using Calendar.DAY_OF_WEEK as the argument

        System.out.println("myCal Day of Week: " + myCal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Expected: 6");     //Note: 1 = Sunday, 2 = Monday, etc.


        //Write similar tests for month, year and day of month.

        int year = myCal.get(Calendar.YEAR);
        int month = myCal.get(Calendar.MONTH) + 1;
        int dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek;

        System.out.println("The current date is: " + month + "/" + dayOfMonth + "/" + year);
        System.out.println("Expected: 9/25/2020");


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html
        myCal.add(Calendar.DAY_OF_MONTH,100);
        year = myCal.get(Calendar.YEAR);
        month = myCal.get(Calendar.MONTH) + 1;
        dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        System.out.println("100 days from today is: " + month + "/" + dayOfMonth + "/" + year);
        System.out.println("Expected: 1/3/2020");

        year = year - 1;
        myCal.add(Calendar.DAY_OF_MONTH,63);
        month = myCal.get(Calendar.MONTH) + 1;
        dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);
        dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK) + 6;
        System.out.println("My birthday in 2020 is: " + month + "/" + dayOfMonth + "/" + year);
        System.out.println("The weekday of my 2020 birthday is: " + dayOfWeek);


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)
        myCal.add(Calendar.DAY_OF_MONTH,10000);
        dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("The weekday of 10,000 days after my 2020 birthday is: " + dayOfWeek);


    }

}