import java.util.Scanner;
public class FattMiedler
{
  public static void main (String[] args)
  {
    String firstName, lastName, fName, lName;
    Scanner scan= new Scanner (System.in);
    System.out.println(" What's your first name?");
    firstName= scan.nextLine();
    System.out.println("What's your lastr name?");
    lastName= scan.nextLine();
    fName= lastName.substring(0,1) + firstName.substring(1);
    lName= firstName.substring(0,1) + lastName.substring(1);
    System.out.println(" You're new name is: " + fName+" " + lName);
  }
}
    