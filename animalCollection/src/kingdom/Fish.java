package kingdom;

public class Fish extends AbstractAnimal{

  public Fish(String name, int year){
    super(name, year);
  }

  @Override
  public int getYear(){
    return year;
  }
  public void setYear(int year){
    this.year = year;
  }

  @Override
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }

  @Override
  public String getMove(){
    return "Swimming";
  }

  @Override
  public String getBreath(){
    return "Gills";
  }

  @Override
  public String getReproduce(){
    return "Eggs";
  }

  // @Override
  // public String toString(){
  //   return "Fish ->  Name: " + name + " Year: " + year;
  // }
}
