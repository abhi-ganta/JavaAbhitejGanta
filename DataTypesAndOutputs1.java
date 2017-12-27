public class DataTypesAndOutputs1
  /* purpose; learn data types and outputs
   * author: Abhi Ganta
   * Date: Aug 21, 2014
   */
{
  public static void main (String[] args) 
  {
    // variable declartions
    String name1= "Lambert";
    String  name2;
    int population = 2764;
    double avgHeight = 67.5;
    
     // char data type
    char c1 = 'L';
    char c2 = 'H';
    char c3 = 'S';
    char c4 = 'A';
    char c5 = 'G';
  
  
    
    System.out.println (name1+" "+"High School");
    System.out.println ("Population:"+population);
    population= population+6;
    System.out.println ("New Population:"+population);
    
    System.out.println ("Average Height(2010):" +avgHeight+" inches");
    avgHeight= avgHeight+1.4;
    System.out.println ("Average Height(2011):" +avgHeight+" inches");
    
    System.out.println(c1+c2+c3); //math edition
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
    System.out.println("initials: "+c1+c2+c3);
    
    //boolean
    boolean sunny;
    sunny = true;
    System.out.println("It is sunny: " +sunny); 
    
    boolean funny;
    funny = true;
    System.out.println("Kevin Hart is funny: " +funny);
    
    
        

    
    
   
  }
}
