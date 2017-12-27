import java.util.*;
import java.util.*;
public class WhileOrFor
{
  public static void main (String[] args)
  {
    Scanner scan= new Scanner(System.in);
    int value1;
    System.out.println("Enter a limiting integer value");
    value1= scan.nextInt();
    
    for(int i=0;i<=value1; i++)
    {
      
      System.out.println(i);
    }
    int i= 0;
      while (i<=value1)
    {
      System.out.println(i);
      i++;
  }
}
}