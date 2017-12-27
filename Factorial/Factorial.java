import java.util.Scanner;
 
public class Factorial
{
   public static void main(String args[])
   {
   }
     public static int fact(int num)
     {
       if(num == 0)
       {
         return 1;
       }
       else
       {
         return num * fact(num-1);
       }
     }
   }