import java.util.*;
public class ArrayListTest
{
  public static void main (String[] args)
  {
    ArrayList<Object> fun = new ArrayList<Object>();
    fun.add("dance");
    fun.add("NETFLIX");
    fun.add("slumber party");
    fun.add("car");
    fun.add("Six Flags");
    fun.add("coding");
    System.out.println(fun);
    fun.remove("coding");
    System.out.println(fun);
    System.out.println("Six Flags is at location: " +fun.indexOf("Six Flags"));
    System.out.println("Location 3: " +fun.get(3));
    System.out.println("The size of the array is: " +fun.size());
    fun.set(3, "robotics");
    System.out.println(fun);
    ListIterator iterator = fun.listIterator();
    while(iterator.hasNext())
      System.out.println(iterator.next());
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(1);
    numbers.add(0);
    numbers.add(0);
    numbers.add(1);
    numbers.add(1);
    numbers.add(1);
    System.out.println(numbers);
    for(int i=0;i<numbers.size();i++){
      if(numbers.get(i) ==0){
      numbers.remove(i);
    i--;
      }
    }
    System.out.println(numbers);
  }
}
    
    