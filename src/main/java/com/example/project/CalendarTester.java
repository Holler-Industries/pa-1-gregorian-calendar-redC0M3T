package com.example.project;
import java.util.*;

public class CalendarTester {


    public static void main(String[] args) {


        //This constructs a GregorianCalendar object
        GregorianCalendar myCal = new GregorianCalendar(2020, Calendar.SEPTEMBER, 25 );


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

        if (month == 1)
        { System.out.println("The current date is: January/" + dayOfMonth + "/" + year); }

        else if (month == 2)
        { System.out.println("The current date is: February/" + dayOfMonth + "/" + year); }

        else if (month == 3)
        { System.out.println("The current date is: March/" + dayOfMonth + "/" + year); }

        else if (month == 4)
        { System.out.println("The current date is: April/" + dayOfMonth + "/" + year); }

        else if (month == 5)
        { System.out.println("The current date is: May/" + dayOfMonth + "/" + year); }

        else if (month == 6)
        { System.out.println("The current date is: June/" + dayOfMonth + "/" + year); }

        else if (month == 7)
        { System.out.println("The current date is: July/" + dayOfMonth + "/" + year); }

        else if (month == 8)
        { System.out.println("The current date is: August/" + dayOfMonth + "/" + year); }

        else if (month == 9)
        { System.out.println("The current date is: September/" + dayOfMonth + "/" + year); }

        else if (month == 10)
        { System.out.println("The current date is: October/" + dayOfMonth + "/" + year); }

        else if (month == 11)
        { System.out.println("The current date is: November/" + dayOfMonth + "/" + year); }

        else
        { System.out.println("The current date is: December/" + dayOfMonth + "/" + year); }

        System.out.println("Expected: September/25/2020");


        //Call the .add method to add 100 days to myCal.  Then, check the date and weekday of this new date.
        // To see that it is correct, check out this calendar calculator:
        //http://www.timeanddate.com/date/dateadd.html
        myCal.add(Calendar.DAY_OF_MONTH,100);
        year = myCal.get(Calendar.YEAR);
        month = myCal.get(Calendar.MONTH) + 1;
        dayOfMonth = myCal.get(Calendar.DAY_OF_MONTH);

        if (month == 1)
        { System.out.println("The current date is: January/" + dayOfMonth + "/" + year); }

        else if (month == 2)
        { System.out.println("The current date is: February/" + dayOfMonth + "/" + year); }

        else if (month == 3)
        { System.out.println("The current date is: March/" + dayOfMonth + "/" + year); }

        else if (month == 4)
        { System.out.println("The current date is: April/" + dayOfMonth + "/" + year); }

        else if (month == 5)
        { System.out.println("The current date is: May/" + dayOfMonth + "/" + year); }

        else if (month == 6)
        { System.out.println("The current date is: June/" + dayOfMonth + "/" + year); }

        else if (month == 7)
        { System.out.println("The current date is: July/" + dayOfMonth + "/" + year); }

        else if (month == 8)
        { System.out.println("The current date is: August/" + dayOfMonth + "/" + year); }

        else if (month == 9)
        { System.out.println("The current date is: September/" + dayOfMonth + "/" + year); }

        else if (month == 10)
        { System.out.println("The current date is: October/" + dayOfMonth + "/" + year); }

        else if (month == 11)
        { System.out.println("The current date is: November/" + dayOfMonth + "/" + year); }

        else
        { System.out.println("The current date is: December/" + dayOfMonth + "/" + year); }

        System.out.println("Expected: January/3/2021");


        myCal = new GregorianCalendar(2020, Calendar.MARCH, 7 );

        dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);
        System.out.println("My birthday in 2020 is: March/7");
        System.out.println("The weekday of my 2020 birthday is: " + dayOfWeek);


        //Finally, find what day of the week is 10,000 days after your 2020 birthday. Note, you may have to play around
        //with adding or subtracting days to get to your birthday date (hmm, how can you subtract days?)
        myCal.add(Calendar.DAY_OF_MONTH,10000);
        dayOfWeek = myCal.get(Calendar.DAY_OF_WEEK);
        System.out.println("The weekday of 10,000 days after my 2020 birthday is: " + dayOfWeek);


    }

}