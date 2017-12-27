public class Tiger extends Kitty{
  private String talk;
  
  public Tiger(String name, String food, boolean poop, boolean isAPet, String talk)
  {
    super(name, food, poop, isAPet, talk);
  }
  public String getTalk(){
    return "I'am Hobbes, child of Kitty";
  }
  public String toString()
  {
    return super.toString();
  }
}
  