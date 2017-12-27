public class Bear
{
  private String face, top, bottom;
  public Bear(String s1, String s2, String s3)
  {//This is a default constructor Constructors are
   //instance variables. Bear had three instance variables.
    face= s1;
    top=s2;
    bottom=s3;
  }
  public Bear()
  {//default constructor
    face= "happy";
    top= "dress shirt with bowtie";
    bottom= "khakis";
  }
  public String toString()
  {
    return("I am a bear\n and I am "+face + " and wearing " +top + " top and " +bottom + " bottom");
  }
  public String getTop()
  {
    return top;
  }
public static void main(String[] args)
{
  Bear b1= new Bear("angry", "t-shirt", "jeans");
  System.out.println(b1.toString());  
  Bear b2= new Bear();
  System.out.println(b2);
  System.out.println(b1.getTop());
 }
}