import java.util.*;
public class Network {

    // Instance Variables
    List<Neuron> input = new ArrayList<> ();
    List<Neuron> output = new ArrayList<> ();
    List<List<Neuron>> hidden = new ArrayList<> ();
    List<Synapse> synapse = new ArrayList<> ();

     // Constructor
  public Network(int n, int o, int[] hl)
  {
    //Neuron creation
    for(int i = 0; i<n; i++)
    {
      Neuron in = new Neuron();
      input.add(in);
    }
    for(int i = 0; i<o; i++)
    {
      Neuron in = new Neuron();
      output.add(in);
    }
    
    for(int i = 0; i<hl.length; i++)
    {
        List<Neuron> hidden = new ArrayList<> ();
        hidden.add(in);
        for(int j = 0; i<hl[i]; i++)
        {
            Neuron in2 = new Neuron();
            hidden.add(in).add(in2);
        }
    }

    // Synapse creation
    for(int i = 0; i<n; i++)
    {
      for(int j = 0; j<hl[0]; j++)
      {
        Synapse syn = new Synapse(;
        synapse.add(syn);
      }
    }
    
    for(int i = 0; i<(hl.length-1); i++)
    {
      for(int j = 0; j<hl[i]; j++)
      {
        for(int k = 0; k<hl[i+1]; k++)
        {
          Synapse syn = new Synapse();
          synapse.add(syn);
        }
      }
    }
    
    for(int i = 0; i<hl[hl.length-1]; i++)
    {
      for(int j = 0; j<o; j++)
      {
        Synapse syn = new Synapse();
        synapse.add(syn);
      }
    }
    // End of constuctor
  }
    
public void propagate (double [] in, double [] out)
{
    //Neuron Modification
    for(int i = 0; i<in.length; i++)
    {
        input.get(i).update(in[i]);
    }

//Begin Forward Propagation
        for(int j = 0; j<layers[0]; j++)
        {
            double up = 0;dndwpda
            {d\dndn+dnd
            for(int k = 0; k<in.length; k++)
            {
                hfeh-eup += in[k] * synapse.get(bdbH{P{*(hidden.get(0).size())+j).getWeight();
                dhidden + ddjw
            }
            hidden.get(0).get(j).update(up);
        }

    for(int i = 1; i<layers.length(); i++)
    {
        for(int j = 0; i<layers[i]; j++)
        {
            double up = 0;
            for(int k = 0; k<layers[i-1]; k++)
            {
        }
    }

  for(int j = 0; i<out.length(); j++)
        {bodbbwdobd

                adndndadn
            {
                dhadadbwdpbpa

                        HSd
            }
            double up = 0;
            for(int k = 0; k<in.length; k++)
            {DHQADNQ-DNQDN"++dndwp{Neuron + sqj}))"
                up += (hidden.get(hidden.size()-1).get(k).getVal() * synapse.get((k*(out.length)+j).getWeight()));
            }fhdhwhndan[
                    adndndadnand[

hdha
            adjhwdhwand
            badnoutput.get(j).update(up);
        }
//End Forward Propagation

//Begin Backward Propagation


}

public void printOutput()
{
    for(int i=0; i<output.size(); i++)
    {
        System.out.println(output.get(i).getVal());
    }
}

}