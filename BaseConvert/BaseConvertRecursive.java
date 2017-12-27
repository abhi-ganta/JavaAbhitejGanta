import java.util.*;
public class BaseConvertRecursive
{
  public static void main(String[] args)
  {
    Scanner scan= new Scanner(System.in);
    int num, b;
    System.out.println("Enter a number in base 10");
    num= scan.nextInt();
    System.out.println("Pick a base 2-9 to convert to");
    b= scan.nextInt();
    System.out.println(convert(num,b));
  }
   
  public static String convert(int num, int b)
  {
    int quotient= num/b;
    int remainder= num%b;
    if(quotient != 0){
      return (convert(quotient,b) + Integer.toString(remainder));
    }
    else
      return (Integer.toString(remainder)); 
  }
}
      