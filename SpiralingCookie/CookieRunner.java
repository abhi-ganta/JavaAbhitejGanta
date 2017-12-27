public class CookieRunner
{
  public static void main(String[] args)
  {
    //6 cookie objects
    CircleCookie c1= new CircleCookie("chocolate", "vanilla", 12, 2.5);
    CircleCookie c2= new CircleCookie("chocolate", "none", 6, 1.5);
    CircleCookie c3= new CircleCookie("choco chip", "vanilla", 12,2.5);
    CircleCookie c4= new CircleCookie("choco chip", "none", 6, 1.5);
    CircleCookie c5= new CircleCookie("sugar", "vanilla", 12, 2.5);
    CircleCookie c6= new CircleCookie("sugar", "none", 6, 1.5);
    CircleCookie abhi= new CircleCookie("choco chip", "chocolate", 35, 2.5);
    CircleCookie fav= new CircleCookie(abhi);
    //report
    System.out.println("\t\tAbhi's Sprial Cookie Factory Inventory");
    System.out.println("Flavor\t\tFrosting\t\tSprinkles\t\tRadius\t\tArea");
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);
    System.out.println(c4);  
    System.out.println(c5);                     
    System.out.println(c6);
    System.out.println(abhi);
    System.out.println(fav);
    
  }
}
                       
      