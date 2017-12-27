import java.util.*;
import java.lang.*;
//****************************************************
//Title:Ap Computer Science- Multiplication Table
//Author: Abhi Ganta
//Date: October 5, 2014
//Period: 1
//Purpose: Create out a Multiplication Table from 1-12
//****************************************************
public class MTable
{
  public static void main(String[]args)
  {
    int row;
    int col;
    for(row=1; row<=12; row++)
    {
      for(col=1; col<=12; col++)
          {
        System.out.print(col*row + " ");
      }
          System.out.println();
          }
}
}

 



