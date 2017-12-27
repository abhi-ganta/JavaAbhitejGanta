  import java.util.Scanner;
  import java.lang.*;
  public class RandomNumberGame
  {
    public static void main (String[] args)
    {
      int guess, randomNum;
      randomNum= (int)((Math.random()*100)+1);
      Scanner scan= new Scanner(System.in);
      System.out.println("What is your guess?");
      guess= scan.nextInt();
      if(randomNum > guess)
      {
        System.out.println("The actual number is: " +randomNum+ " your guess was " +guess+ " and it is too low ");
      }
      if(randomNum < guess)
      {
        System.out.println("The actual number is: " +randomNum+ " your guess was " +guess+ " and it is too high ");
      }
      if (randomNum == guess)
      {
        System.out.println("The actual number is: "+randomNum+ " your guess was " +guess+ " and it was correct ");
      }
        
      
    }
  }