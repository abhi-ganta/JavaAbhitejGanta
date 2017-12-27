import java.util.*;
//*************************************************************************************
//Title:Ap Computer Science- Leap Year Program
//Author: Abhi Ganta
//Date: October 5, 2014
//Period: 1
//Purpose: Create a program that tells you if the year they enter is a leap year or not
//*************************************************************************************
public class LeapYear
{
    public static void main(String args[])
    {
        int year;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Year: ");
        year= scan.nextInt();
        boolean isLeapYear = false;
        if(year<1582)
        {
          System.out.println("No leap year before Gregorian calender which started in 1582.");
        }
        else if(year % 400 == 0)
        {
            isLeapYear = true;
        }
        else if (year % 100 == 0)
        {
            isLeapYear = false;
        }
        else if(year % 4 == 0)
        {
            isLeapYear = true;
        }
        else
        {
            isLeapYear = false;
        }

        if(isLeapYear)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
 
    }
}