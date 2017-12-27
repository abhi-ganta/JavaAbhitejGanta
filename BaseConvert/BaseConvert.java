import java.util.Scanner;
public class BaseConvert
{
  public static void main(String[] args)
  {
    Scanner scan= new Scanner(System.in);
    int base10num, base, place0, tempNum, place1, place2, place3, place4, place5, place6,place7;
    System.out.println("Enter a number in base 10");
    base10num= scan.nextInt();
    System.out.println("Pick a base 2-9 to convert to");
    base= scan.nextInt();
    place0= base10num% base;
    tempNum= base10num/ base;
    place1= tempNum% base;
    tempNum= tempNum/ base;
    place2= tempNum% base;
    tempNum= tempNum/base;
    place3= tempNum% base;
    tempNum= tempNum/base;
    place4= tempNum% base;
    tempNum= tempNum/base;
    place5= tempNum% base;
    tempNum= tempNum/base;
    place6= tempNum% base;
    tempNum= tempNum/base;
    place7= tempNum% base;
    System.out.println(base10num + " converted to base " +base+ " is "+place7+place6+place5 +place4+ place3 + place2 + place1 + place0);
  }
}