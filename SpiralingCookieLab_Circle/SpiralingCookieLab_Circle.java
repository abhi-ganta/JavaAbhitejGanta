import java.util.*;
import java.util.*;
public class SpiralingCookieLab_Circle
{
  public static void main (String[] args)
  {
    Scanner scan= new Scanner(System.in);
    double radius, area;
    System.out.println("What is the radius of your circle in feet?");
    radius= scan.nextDouble();
    area= (3.14*(Math.pow(radius,2)));
    System.out.println("The area of your circle is: " +area+ " feet squared");
  }
}
    
           
    
    
    