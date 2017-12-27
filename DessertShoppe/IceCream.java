//**********************************************************
//Author: Abhi Ganta
//Date: 2/19/15
//Purpose: Print a receipt of dessert items someone ordered
//**********************************************************
public class IceCream extends DessertItem
{
  int cost;
  
  public IceCream(String n, int  c)
  {
   super(n);
   cost = c;
  }
  
  public int getCost()
  {
    return Math.round(cost);
  }
  public String toString()
  {
    return (name) + "\t\t" + DessertShoppe.cents2dollarsAndCents(cost)+ "\n";
  }
}
  