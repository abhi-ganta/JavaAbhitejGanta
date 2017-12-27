public class Animal
{
  public String name;
  public String food;
  public boolean poop;
  public boolean isPet;
  public final static String ZOO_NAME = "Wally's World";
  public Animal() {
    this("","",true,true);}


public Animal(String n, String f, boolean p, boolean isAPet)
{
  this.name = n;
  this.food = f;
  this.poop = p;
  this.isPet = isAPet;
}

public String getName(){
  return "My name is " +name;}
  public String getFood(){
    return "I like to eat " +food;}
public String doPoop(){
  if(this.poop) 
    return "Yes, I poop";
  else
    return "No, I don't poop";
}
public String isPet(){
  if(this.isPet)
    return "I'm a great pet";
  else 
    return "I'm not a pet";
}

public String toString()
{
  return getName()+"\n"+getFood()+"\n"+doPoop()+"\n"+isPet()+"\n";
}
}

  