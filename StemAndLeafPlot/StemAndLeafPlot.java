//***********************************
//Name: Abhi Ganta
//Period: 1
//Date: 1/6/15
//Project: Stem and Leaf Plot
//***********************************
import java.util.*;
public class StemAndLeafPlot
{
  public static void main(String[] args)
  {
    //Creates an array of 100 random integers from 0-100
    int[] array = new int[100];
    for(int i=0; i<array.length; i++)
    {
      array[i] = (int)(Math.random() * 100);
      System.out.print(array[i]+" ");
    }
    System.out.println(" ");
    System.out.println(" ");
    int[][] array2 = new int[10][];
    
 
  //Sorts the array using selection sorting 
      int min, temp;
      for(int index = 0; index< array.length-1; index++)
      {
        min = index;
        for(int scan = index+1; scan< array.length; scan++)
          if(array[scan] < array[min])
          min = scan;
        temp = array[min];
        array[min] = array[index];
        array[index] = temp;
      }
  
  //loop for 0
  System.out.println();
  System.out.println("\t  Abhi's Stem and Leaf Plot");
  System.out.println("----------------------------------------------------");
  System.out.print("0|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<10)
      {
        System.out.print(array[i] + ", ");
      }
    }
    
  //loop for 1
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("1|  ");
    for(int i=0;i<array.length;i++)
    {
      if(array[i]<20&&array[i]>9)
      {
        System.out.print(array[i]-10 + ", ");
      }
    }
   
  //loop for 2
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("2|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<30&&array[i]>19)
      {
        System.out.print(array[i]-20 + ", ");
      }
    }
  
  //loop for 3
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("3|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<40&&array[i]>29)
      {
        System.out.print(array[i]-30 + ", ");
      }
    }
 
  //loop for 4
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("4|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<50&&array[i]>39)
      {
        System.out.print(array[i]-40 + ", ");
      }
    }
 
  //loop for 5
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("5|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<60&&array[i]>49)
      {
        System.out.print(array[i]-50 + ", ");
      }
    }
  
  //loop for 6
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("6|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<70&&array[i]>59)
      {
        System.out.print(array[i]-60 + ", ");
      }
    }
  
  //loop for 7
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("7|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<80&&array[i]>69)
      {
        System.out.print(array[i]-70 + ", ");
      }
    }
  
   //loop for 8
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("8|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<90&&array[i]>79)
      {
        System.out.print(array[i]-80 + ", ");
      }
    }
  
   //loop for 9
  System.out.println();
  System.out.println("----------------------------------------------------");
  System.out.print("9|  ");
  for(int i=0;i<array.length;i++)
    {
      if(array[i]<100&&array[i]>89)
      {
        System.out.print(array[i]-90 + ", ");
      }
    }
  System.out.println("");
  System.out.println("----------------------------------------------------");
}
}
