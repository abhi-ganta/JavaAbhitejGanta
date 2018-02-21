import java.util.*;

public class NeuralRunner       
{
    public static void main (String [] args)
    {
        //ArrayList input = new ArrayList ();

        int [] boop = {3,2};
        Network test = new Network(2,1,boop);

        double [] in = {1.2,3.6};
        double [] out = {5.8};


        test.propagate(in,out);

        test.printOutput();




    }

/*
    { 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value")
        input = input.nextArray();
        //System.out.println(input);
            
        }
*/
}