public class AnimalRunner
{
  public static void main(String[] args)
  {
    System.out.println("Wally's World\n--------------------");
    
    Doge doge1 = new Doge("Spike","salad",true,true,"Doge");
    System.out.println(doge1.toString());
    Animal a1 = new Animal ("Batman", "nothing...I'm Batman", true, false);
    System.out.println(a1.toString());
    Kitty kat1 = new Kitty("Boo","Meow-Mix",true,true,"Meow");
    System.out.println(kat1.toString());
    Tiger tig = new Tiger("Hobbes","Keyboards",true,false,"Roar");
    System.out.println(tig.toString());
    Animal malvika = new Kitty("Malvika","Starbucks Coffee",true,false,"I like Sai");
    System.out.println(malvika.toString());
    
    AnimalArray animal = new AnimalArray();
    animal.add(new Animal("college student","ramen noodles",true,false));
    animal.add(new Doge("Kirby","food",true,true,"Woof"));
    animal.add(new Cow("Moopheus","government subsidies",true,false,"Mooo"));
    System.out.println(animal.toString());
  }
}