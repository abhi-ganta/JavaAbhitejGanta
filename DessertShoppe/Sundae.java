//**********************************************************
//Author: Abhi Ganta
//Date: 2/19/15
//Purpose: Print a receipt of dessert items someone ordered
//**********************************************************
public class Sundae extends IceCream
{
  String topping;
  int topCost;
  
  public Sundae(String n,int c,String t, int tC)
  {
   super(n,c);
   topping = t;
   topCost = tC;
  }
  
  public int getCost()
  {
    int cost = (super.getCost() + topCost);
    return Math.round(cost);
  }
  public String toString()
  {
    return topping + " Sundae" +" with " + "\n" + name + "\t\t" + DessertShoppe.cents2dollarsAndCents(super.getCost()+topCost)+ "\n";
  }
}
  