//*********************************************************************************************************
//Author:Abhi Ganta
//Purpose:Design and write a program that computes a student’s grade in AP CS by using objects and methods.
//Period:1
//Date:11/2
//*********************************************************************************************************
public class ReportCardRunner
{
  public static void main(String args[])
  {
   //6 student objects 
   Student stud1= new Student();//default student
   Student stud2= new Student ("Ariana","Grande", 74.27, 90.56);
   Student stud3= new Student ("June","Zinman", 86.62, 91.28);
   Student stud4= new Student ("Neil","Mander", 68.23, 79.52);
   Student stud5= new Student ("Sheldon","Cooper", 99.45, 102.39);
   Student stud6= new Student ("Dingus","Khan", 105.83, 108.16);
   System.out.println("\t\t\t\t\t\tReport Card");
   System.out.println();
   System.out.println("First Name\t\tLast Name\t\tSummative Average\t\tFormative Average\t\tCourse Average\tLetter Grade");//tabs are for formatting
   System.out.println("_________________________________________________________________________________________________________________________________________");
   System.out.println(stud1);//Will print all the student's info listed above plus the student's course average and letter grade
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println(stud2);
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println(stud3);
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println(stud4);
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println(stud5);
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println(stud6);
   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
   System.out.println("Class Average is: " + Math.floor(stud1.calcCourseAvg()+stud2.calcCourseAvg()+stud3.calcCourseAvg()+stud4.calcCourseAvg()+stud5.calcCourseAvg()+stud6.calcCourseAvg())/6.0);//calculates the entire class average
   
  }
}