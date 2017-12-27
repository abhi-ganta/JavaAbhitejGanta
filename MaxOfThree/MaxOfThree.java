import java.util.*;
public class MaxOfThree
{
  public static void main (String [] args)
  {
    int num1, num2, num3, max;
    double avg;
    Scanner scan= new Scanner(System.in);
    System.out.println("Pick 3 numbers");
    num1= scan.nextInt();
    num2= scan.nextInt();
    num3= scan.nextInt();
    if(num1>num2)  //num1 or num3 is max
    {
     if(num1>num3)
     {
      max= num1;
    }
    else
    {
      max= num3;
      }
    }
    else
    {
    if(num2>num3)
    {
      max= num2;
    }
    else
    {
      max= num3;
    }
   }
    System.out.println("The max is:" +max);
    Math.max(Math.max(num1,num2),num3);
    avg=((num1+num2+num3)/3);
    System.out.println("The average of the 3 numbers:" +avg);
  }
}