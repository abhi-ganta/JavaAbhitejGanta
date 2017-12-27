/*************************************************************** 
//File: Paint.java 
// 
//Purpose: Determine how much paint is needed to paint the walls 
//of a room given its length, width, and height 
//Date: September 6, 2014
//Author: Abhi Ganta
//**************************************************************/
import java.util.Scanner; 
public class Paint2 
{ 
public static void main(String[] args) 
{ 
final int COVERAGE = 350;  
final int DOOR = 20; 
final int WINDOW = 15; 
double length, width, height, doors, windows; 
double totalSqFt; 
double paintNeeded; 
Scanner scan = new Scanner(System.in);  
System.out.print("Enter length: "); 
length = scan.nextInt(); 
System.out.print("Enter width: "); 
width = scan.nextInt(); 
System.out.print("Enter height: "); 
height = scan.nextInt(); 
System.out.print("Enter number of doors: "); 
doors = scan.nextInt(); 
System.out.print("Enter number of windows: "); 
windows = scan.nextInt(); 
totalSqFt = (2*width*height) + (2*length*height) - (doors*DOOR) - (windows*WINDOW); 
paintNeeded = Math.ceil(totalSqFt / COVERAGE); 
System.out.println("Height= " + height);
System.out.println(" Width= " + width);
System.out.println(" Length=" + length);
System.out.println(" # of Doors=" + doors);
System.out.println(" # of windows=" + windows);
System.out.println(" Gallons of Paint Needed= " + paintNeeded); 
} 
}