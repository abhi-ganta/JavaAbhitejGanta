import java.util.*;
public class Die
{//instance variables
  private int numSides;
  private int faceValue;
  private static Random generator = new Random();
  
  public Die()//default die
{
  numSides=6;
  faceValue=1;
}
   public Die(int faces)
{
     if(faces<2)faces=2;
     numSides = faces;
     faceValue=1;  
}
  public int roll()
  {
    faceValue= generator.nextInt(numSides) +1;
    return faceValue;
  }
  public int getFaceValue()
  {
    return faceValue;
  }        
  }
         