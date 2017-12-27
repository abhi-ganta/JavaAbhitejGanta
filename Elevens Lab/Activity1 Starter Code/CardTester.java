/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card a = new Card("7","Hearts",7);
   Card b = new Card("3","Spades",3);
   Card c = new Card("5","Diamonds",5);
   System.out.println(a.toString() + b.toString() + c.toString());
 }
}
