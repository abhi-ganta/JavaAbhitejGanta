public class AnimalArray
{
  private int numAnimals = 0;
  private Animal[] zoo = new Animal[100];
  public AnimalArray()
  {
  }
  public void add(Animal item)
  {
    zoo[numAnimals] = item;
    numAnimals++;
  }
  public int numberOfAnimals()
  {
    return numAnimals;
  }
  public String toString()
  {
    String output = "";
    output += Animal.ZOO_NAME + "\n";
    output += "----------------------\n";
    output += "Number of Animals: " + numAnimals+"\n";
    
    for(int i=0;i<numAnimals; i++)
    {
      output += zoo[i] + "\n";
    }
    output += "\n";
    return output;
  }
}