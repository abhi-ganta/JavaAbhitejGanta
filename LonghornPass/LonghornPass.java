import java.util.*;
import java.lang.*;
public class LonghornPass
{
  public static void main(String [] args)
  {
    Scanner scan= new Scanner(System.in);
    System.out.println(" What's your full name?");
    String fName= scan.nextLine();
    String tFirst, sLast, number, newName;
    tFirst= fName(2,3);
    sLast= fName(10,11);
    newName= (tFirst + sLast + number);
    System.out.println("Your new password is:" +" "+ newName);
  }
}