import java.util.*;

public class Synapse
{
    double weight;

//Constructor
    public Synapse (double w)
    {
        weight = w;
    }

//Default Constructor...weights are random for the 1st forward propagation
    public Synapse ()
    {
        Random r = new Random();
        weight = r.nextDouble();
    }

    public void update (double v)
    {
        val = v;
    }

    public double getWeight ()
    {
        return weight;
    }
}

