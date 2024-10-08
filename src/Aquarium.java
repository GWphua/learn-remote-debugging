import java.util.*;


class Aquarium
{
  private ArrayList<Fish> fish;

  public static void run(String[] args)
  {
    var aquarium = new Aquarium();
    System.out.println(aquarium.getFish());
    // fish has already been initialized
    System.out.println(aquarium.getFish()); // line n1
  }

  private ArrayList<Fish> getFish()
  {
      if (fish == null) {
          initFish();
      }
    return fish;
  }

  private void initFish()
  {
    fish = new ArrayList<>(Arrays.asList(
        new Fish("Bubbles"),
        new Fish("Calypso"),
        new Fish("Dory")
    ));
  }
}

class Fish
{
  private String name;

  Fish(String name)
  {
    this.name = name;
  }

  public String toString()
  {
    return name;
  }
}