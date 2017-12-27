import java.util.*;
public class DieGame
{
  public static void main(String[] args)
  {
    int numRolls;
    Die die1= new Die();
    Die die2= new Die();
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number of rolls you want to play");
    numRolls= scan.nextInt();
    
    //*************************
    //Game Menu
    //*************************
    System.out.println("Enter Game # to play");
    System.out.println("1- High Roller, 2- Snake Eyes");
    int gameNum= scan.nextInt();
    if(gameNum == 1) System.out.println("You are now playing High Roller");
    else System.out.println("You are now playing Snake Eyes");
    
     //***********************
     //Game 1- High Roller
     //************************
    if(gameNum == 1)
    {
    int die1_counter=0,die2_counter=0;
    for(int roll = 1;roll<=numRolls;roll++)
    {
      if(die1.roll() >= die2.roll())
           die1_counter++;
      else
           die2_counter++;
    }
    System.out.println("Number of Rolls: " +numRolls);
    System.out.println("Die 1 Counter: " +die1_counter);
    System.out.println("Die 2 Counter: " +die2_counter);
    if(die1_counter > die2_counter)
      System.out.println("Die 1 Wins!");
    else
      System.out.println("Die 2 Wins!");
  }
    //**********************
    //Game 2- Snake Eyes
    //**********************
    else if(gameNum == 2)
    {
      int snake_eyes = 0;
      for(int roll = 1; roll<=numRolls; roll++)
      {
        if(die1.roll()==1 && die2.roll()==1)
          snake_eyes++;
      }
      System.out.println("Number of Rolls: " +numRolls);
      System.out.println("Number of Snake Eyes: " +snake_eyes);
}
}
}
      
    
    
