/*************************************************************** 
//File: Paint.java 
// 
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height 
//Date: September 4, 2014
//Author: Abhi Ganta
//**************************************************************/
import java.util.Scanner; 
public class Paint 
{
 public static void main(String[] args) 
 {
   final int COVERAGE = 350; 
   double length, width, height; 
   double totalSqFt; 
   double paintNeeded; 
   Scanner scan = new Scanner(System.in); 
   System.out.print("Enter length: "); 
   length = scan.nextDouble(); 
   System.out.print("Enter width: "); 
   width = scan.nextDouble(); 
   System.out.print("Enter height: "); 
   height = scan.nextDouble(); 
   totalSqFt = (2*width*height) + (2*length*height); 
   paintNeeded= Math.ceil(totalSqFt/COVERAGE);
   System.out.println("Height= " + height);
   System.out.println("Width= " + width);
   System.out.println("Length=" + length);
   System.out.println("The Total Square Feet is: "+ totalSqFt);
   System.out.println("Gallons of Paint Needed=  " + paintNeeded +" Gallons"); 
 } 
} 
