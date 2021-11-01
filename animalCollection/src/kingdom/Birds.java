package kingdom;

public class Birds extends AbstractAnimal{

  public Birds(String name, int year){
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
    return "Fly";
  }

  @Override
  public String getBreath(){
    return "Lungs";
  }

  @Override
  public String getReproduce(){
    return "Eggs";
  }

  // @Override
  // public String toString(){
  //   return "Birds ->  Name: " + name + " Year: " + year;
  // }
}
