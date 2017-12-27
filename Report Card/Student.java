//*********************************************************************************************************
//Author:Abhi Ganta
//Purpose:Design and write a program that computes a student’s grade in AP CS by using objects and methods.
//Period:1
//Date:11/2
//*********************************************************************************************************
import java.text.DecimalFormat;                    
public class Student
{ //instance variables
  String firstName, lastName;
  double summativeAverage, formativeAverage, courseAvg;
  char letterGrade=0;
public Student(String n, String l,double s, double f)
 { //constructor
   firstName= n;
   lastName= l;
   summativeAverage= s;
   formativeAverage= f;
 }
public Student() //default student
{
  firstName= "John";
  lastName= "Doe";
  summativeAverage= 80.2;
  formativeAverage= 79.2;
}
//-----------------------------------------------------------------
//This accessor method calculates the course average of the student
//by multiplying the summative average by .75 and the formattive 
//average by .25 and adds the two values together.
//-----------------------------------------------------------------
public double calcCourseAvg()
{
  courseAvg=(.75*summativeAverage)+(.25*formativeAverage);
  return courseAvg;
}
//------------------------------------------------------------------------------------
//This modifier determines the letter grade of the student based on the course average
//------------------------------------------------------------------------------------
public char calcLetterGrade()
{
 if(Math.round(courseAvg) >= 90)
 {
   letterGrade= 'A';
 }
 else if(Math.round(courseAvg) >=80)
 {
   letterGrade= 'B';
 }
 else if(Math.round(courseAvg) >=70)
 {
   letterGrade= 'C';
 }
 else if(Math.round(courseAvg) < 70)
 {
   letterGrade= 'F';
 }
 Math.round(courseAvg);
 return letterGrade;
}
public double getSumAvg()
{
  return summativeAverage;
}
 public String toString()
 {
   DecimalFormat fmt= new DecimalFormat("###.00");
   return(firstName + "\t\t" + lastName + "\t\t" + summativeAverage + "\t\t\t" + formativeAverage +"\t\t\t"+fmt.format(calcCourseAvg())+ "\t\t  " +(calcLetterGrade()));
 }
}



  
