public class IntArrayRunner
{
  public static void main(String[] args)
  {
    //step 2 establish 2 arrays
    int[] t1= {1,2,3,4,5};
    int[] t2= {6,4,2,3};
    System.out.println(t1);//returns hexadecimal
    //toString
    IntArrayLab a1= new IntArrayLab(t1);
    IntArrayLab a2= new IntArrayLab(t2);
    System.out.println("Array t1 = "+a1.toString());
    System.out.println("Array t2 = "+a2.toString());
    System.out.println("Smallest of Array t1: " + a1.getSmallest());
    System.out.println("Smallest of Array t2: " + a2.getSmallest());
    System.out.println("Largest of Array t1: " + a1.getLargest());
    System.out.println("Largest of Array t2: " + a2.getLargest());
    System.out.println("Average of Array t1: " +a1.getAverage());
    System.out.println("Average of Array t2: " +a2.getAverage());
    System.out.println("Every Other of t1: "+ a1.toString());
    
    // Step 10 reverse method
    a1.reverse();
    a2.reverse();
    System.out.println("Reversed t1: " +a1.toString());
    System.out.println("Reversed t2: " +a2.toString());
    
    //Step 12 Find Index method
    System.out.println("array: "+ a1.toString());
    System.out.println("looking for 4");
    System.out.println("found at: " + a1.getIndex(4));
    System.out.println("looking for 10");
    System.out.println("found at: " + a1.getIndex(10));
   
    //2D Arrays
    int [][] doubleD =  {{1,2,3,4,5},
                         {11,12,13,14,15},
                         {21,22,23,24,25},
                         {31,32,33,34,35},
                         {41,42,43,44,45}};
   
    // Create 2D array and print row-major order loop
    System.out.println("\nDoubleD in row-major order");
    for (int row=0;row<doubleD.length;row++){
      for (int col=0;col<doubleD[row].length;col++)
        System.out.print (doubleD[row][col]+" ");
      System.out.println();}
    
    System.out.println("\nDoubleD in col-major order");
    for (int col=0;col<doubleD.length;col++){
      for (int row=0;row<doubleD[col].length;row++)
        System.out.print (doubleD[row][col]+" ");
      System.out.println();}
    
  }
}
