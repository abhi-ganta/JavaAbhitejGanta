//**********************************************************
//Author: Abhi Ganta
//Date: 2/19/15
//Purpose: Print a receipt of dessert items someone ordered
//**********************************************************
public class Candy extends DessertItem
{
  double weight;
  int priceperlb;
  
  public Candy(String name, double w, int ppl)
  {
   super(name);
   weight = w;
   priceperlb = ppl;
  }
  
  public int getCost()
  {
  return (int)(Math.round(weight * priceperlb));
  }
  public String toString()
  {
    return weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(priceperlb) + " /lbs." + "\n" + name + "\t\t" + DessertShoppe.cents2dollarsAndCents((int)(weight * priceperlb))+ "\n";
  }
}
  