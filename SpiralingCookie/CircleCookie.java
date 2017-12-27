import java.text.DecimalFormat;
import java.lang.*;
public class CircleCookie
{
  String flavor;
  String frosting;
  int sprinkles;
  double radius;
  public CircleCookie(String t, String f, int s, double r)
  {//constructor
    flavor= t;
    frosting= f;
    sprinkles= s;
    radius= r;
  }
  public CircleCookie()//default cookie_ my favorite
  {
    flavor= "chocolate";
    frosting= "vanilla";
    sprinkles= 12;
    radius= 2.5;
  }
  public CircleCookie(CircleCookie abhi)//copy copier
  {
    flavor=abhi.flavor;
    frosting=abhi.frosting;
    sprinkles=abhi.sprinkles;
    radius=abhi.radius;
  }
  public double getRadius()
  {
    return radius;
  }
  public double getCircleArea(){
    return Math.PI*(Math.pow(getRadius(),2));
  }
  public String toString()
  {
    DecimalFormat fmt= new DecimalFormat("##.##");
    return(flavor + "\t\t" + frosting+ "\t\t" + sprinkles+ "\t\t" + radius+ "\t\t" + fmt.format(getCircleArea()));
  }
}
    