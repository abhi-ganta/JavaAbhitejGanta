import java.util.*;

public class Neuron
{
    // Instance Variables
    double val;
    
    // Constructor
    public Neuron(double v)
    {
        val = v;
    }
    
    // Default Constructor
    public Neuron()
    {
        val = 0;
    }

    public void update (double v)
    {
        val = v;
    }

    public double getVal ()
    {
        return val;
    }
}