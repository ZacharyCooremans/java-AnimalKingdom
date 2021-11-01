package kingdom;

abstract class AbstractAnimal{
  public static int maxId = 1;
  protected int id;
  protected int energy;
  protected String name;
  protected int year;

  public AbstractAnimal(String name, int year){
    id = maxId;
    maxId++;
    energy = 1;
    this.name = name;
    this.year = year;
  }

  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }

    // All animals will increase the amount of food provided
    public void consumeFood(int amount){
      energy += amount;
      System.out.println(name + " consumed " + amount + " units of food. Energy is now " + energy);
    }

    @Override
    public String toString(){
      return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + year + "}";
    }

    // All animals can do, but depends on the animal how they do each of these things and to provide information
    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();
    abstract int getYear();
    abstract String getName();

}
