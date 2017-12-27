import java.util.*;
public class NewArray
{
    public static void main(String[] args)
    {
      Random r = new Random();
      int[] random = new int[10];
      
      int min, temp;
      for(int index = 0; index<random.length-1; index++)
      {
        min = index;
        for(int scan = index+1; scan<random.length; scan++)
          if(random[scan] < random[min])
          min = scan;
        temp = random[min];
        random[min] = random[index];
        random[index] = temp;
      }
      
      for(int i=0; i<random.length; i++)
      {
       random[i] = r.nextInt(10)-10;
       System.out.print(random[i]+" ");
      }
      
      System.out.println();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int Rows = input.nextInt();
      System.out.print("Enter the number of columns: ");
      int Columns = input.nextInt();
      int[][] array2 = new int[Rows][Columns];
      System.out.println(array2);
    }
}
