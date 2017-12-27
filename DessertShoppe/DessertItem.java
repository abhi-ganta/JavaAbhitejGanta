// DessertItem.java - Dessert Item abstract superclass


/**
 * Abstract superclass for Dessert Item hierarchy

 */
public abstract class DessertItem {
  
  protected String name;
  
/**
 * Null constructor for DessertItem class
 */
  public DessertItem() {
    this("");
  }
/**
 * Initializes DessertItem data
 */   
  public DessertItem(String name) {
    if (name.length() <= 25)
      this.name = name;
    else 
      this.name = name.substring(0,25);
  }
/**
 * Returns name of DessertItem
 * @return name of DessertItem
 */  
  public final String getName() {
    return name;
  }
/**
 * Returns cost of DessertItem
 * @return cost of DessertItem
 */  
  public abstract int getCost();

}
   
  
  
   
   