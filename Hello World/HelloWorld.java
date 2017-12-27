public class Abhi.java{
{
  //Purpose: getting info from the user and printing to screen
  //Author: Joel Joseprabu
  //Aug 11, 2014
 
  public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
    
    //Prompt for user's name
    System.out.println("What is your name?");
    //This initializes a String type variable using the user's input
    String firstName = newScanner.nextLine();
    
    //Prompt for last name
    System.out.println("What is your last name?");
    //Same thing as above
    String lastName = newScanner.nextLine();
    
    //Prints out the full name using the variables.
    System.out.println(" Your name is: " + firstName + " " + lastName);
  }
}
}