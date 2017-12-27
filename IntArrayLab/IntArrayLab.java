public class IntArrayLab
{
  //Step 3 establish an integer array named numArray
  private int[] numArray;
  //Step 4 create a constructor that inputs the integer array
  //and call it "theArray" in the class
  public IntArrayLab(int [] theArray)
  {
    numArray= theArray;
  }
  //Step 5 return elements of the array as a string
  public String toString()
  {
    String result = "";
    for (int i=0; i<=numArray.length-1;i++)
      result= result + String.valueOf(numArray[i]) + ", ";
    return result;
  }
  //Step 6 return smallest value in array
  public int getSmallest()
  {
    int smallest=numArray[0];
    for(int index = 1;index<=numArray.length-1;index++)
    {
      if(numArray[index] < smallest)
        smallest = numArray[index];
    }
    return smallest;
  }
  //Step 7 return largest value in array
  public int getLargest()
  {
    int largest=numArray[0];
    for(int index = 1;index<=numArray.length-1;index++)
    {
      if(numArray[index] > largest)
        largest = numArray[index];
    }
    return largest;
  }
  //Step 8 return the average of the array
  public double getAverage()
  {
    int sum = 0;
    for(int num: numArray)
      sum += num;
    return (double)sum/numArray.length;
  }
  //Step 9 write a method that will return every other
  // element of an array
  public int[] getEveryOther(){
    int [] newArray = new int[((numArray.length)/2)];
    int count = 0;
    for (int index = 0; index<=numArray.length-1;index=index+2)
    {
      newArray[count] = numArray[index];
      count++;
    }
    System.out.println("EveryOther: "+newArray.toString());
    return newArray;
    }
  //Step 10: Create a method that reverses the order of the array
  public int[] reverse()
  {
    int [] newArray = new int [numArray.length];
    for(int i=0; i<=numArray.length-1;i++)
    {
      newArray[i] = numArray[numArray.length-1-i];
    }
    numArray = newArray;
    return numArray;
  }
  //Step 11 find the index of a value in the array and return it
  public int getIndex(int num)
  {
    int i = 0;
    for(i=0; i<numArray.length;i++)
    {
      if(numArray[i] == num)
        return i;
    }
    return -1;
}
}