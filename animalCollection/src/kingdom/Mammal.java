package kingdom;

public class Mammal extends AbstractAnimal{

  public Mammal(String name, int year){
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
    return "Walk";
  }

  @Override
  public String getBreath(){
    return "Lungs";
  }

  @Override
  public String getReproduce(){
    return "Live birth";
  }

  // @Override
  // public String toString(){
  //   return "Mammal ->  Name: " + name + " Year: " + year + " Id: " + id;
  // }
}
