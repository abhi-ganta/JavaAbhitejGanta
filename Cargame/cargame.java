/* 
 * Code by Jhost /*
 */
import java.util.*;

public class cargame {
 static int state = 0; // 0 = off, 1 = on
 static int place = 0; // California = 1, Texas = 2, Illinois = 3, Florida = 4
 static Scanner sc = new Scanner(System.in);
 static String answer;
 
 public static void main(String[] args) {
   System.out.println("Do you want to to turn the car on? (Yes/No)");
   answer = sc.next();
   
    if(answer.equalsIgnoreCase("yes")) {
     changeState();
    }
    else {
     terminate();
    }
    
   System.out.println("Where do you want to drive to? (California, Texas, Illinois, Florida)");
   answer = sc.next();
    
    if(answer.equalsIgnoreCase("california")) {
     place = 1;
     System.out.println("You drive across the United States to California.");
    }
    else if(answer.equalsIgnoreCase("texas")) {
     place = 2;
     System.out.println("You drive to the Southern United States and enter Texas.");
    }
    else if(answer.equalsIgnoreCase("illinois")) {
     place = 3;
     System.out.println("You drive to the Northern Untied States and evter Illinois.");
    }
    else if(answer.equalsIgnoreCase("florida")) {
     place = 4;
     System.out.println("You drive to the Gulf of Mexico and enter Florida.");
    }
    else {
     terminate();
     }
    }
 
 public static void changeState() {
  if(state == 0) {
   state = 1;
   System.out.println("The car has been turned on.");
  }
  else {
   state = 0;
   System.out.println("The car has been turned off.");
  }
 }
 
 public static void terminate() {
  System.out.println("The program has ended due to a choice you have made or an invalid choice you have made");
  System.exit(0);
 }
}