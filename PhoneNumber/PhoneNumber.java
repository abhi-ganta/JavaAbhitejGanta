import java.lang.*;
public class PhoneNumber
{
  public static void main (String[] args)
  {
    int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    num1= (int)(Math.random()*8)+2;
    num2= (int)(Math.random()*8);
    num3= (int)(Math.random()*8);
    num4= (int)(Math.random()*7);
    num5= (int)(Math.random()*4);
    num6= (int)(Math.random()*2);
    num7= (int)(Math.random()*9);
    num8= (int)(Math.random()*9);
    num9= (int)(Math.random()*9);
    num10= (int)(Math.random()*9);
    System.out.println("You're phone number is: " +num1+num2+num3+ "-" +num4+num5+num6+ "-" +num7+num8+num9+num10);
  }
}