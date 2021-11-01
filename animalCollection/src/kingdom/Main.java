package kingdom;

import java.util.List;
import java.util.ArrayList;

public class Main{

  private static List<AbstractAnimal> filterAbstractAnimal(List<AbstractAnimal> myList, checkAbstractAnimal tester){
    List<AbstractAnimal> tempList = new ArrayList<>();
    for(AbstractAnimal a : myList){
      if(tester.test(a)){
        tempList.add(a);
      }
    }
    return tempList;
  }

  public static void main(String[] args){
    Mammal panda = new Mammal("Panda", 1869);
    Mammal zebra = new Mammal("Zebra", 1778);
    Mammal koala = new Mammal("Koala", 1816);
    Mammal sloth = new Mammal("Sloth", 1804);
    Mammal armadillo = new Mammal("Armadillo", 1758);
    Mammal raccoon = new Mammal("Raccoon", 1758);
    Mammal bigfoot = new Mammal("Bigfoot", 2021);

    Birds pigeon = new Birds("Pigeon", 1837);
    Birds peacock = new Birds("Peacock", 1821);
    Birds toucan = new Birds("Toucan", 1758);
    Birds parrot = new Birds("Parrot", 1824);
    Birds swan = new Birds("Swan", 1758);

    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    // ALl can display
    // System.out.println(panda.toString());
    // System.out.println(toucan.toString());
    // System.out.println(catfish.toString());

    List<AbstractAnimal> animals = new ArrayList<>();

    animals.add(panda);
    animals.add(zebra);
    animals.add(koala);
    animals.add(sloth);
    animals.add(armadillo);
    animals.add(raccoon);
    animals.add(bigfoot);
    animals.add(pigeon);
    animals.add(peacock);
    animals.add(toucan);
    animals.add(parrot);
    animals.add(swan);
    animals.add(salmon);
    animals.add(catfish);
    animals.add(perch);

    // Display all in descending order by year named
    System.out.println("Filter by desending order by year named");
    animals.sort((a1, a2) -> a2.getYear() - a1.getYear());
    animals.forEach((AbstractAnimal) -> System.out.println(AbstractAnimal));
    System.out.println();

    // Display all animals alphabetically
    System.out.println("Filter animals alphabetically");
    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals.forEach((AbstractAnimal) -> System.out.println(AbstractAnimal));
    System.out.println();

    // Display all animals by how they getMove
    System.out.println("Filter animals by how they move");
    animals.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
    animals.forEach((AbstractAnimal) -> System.out.println(AbstractAnimal.getName() + " " + AbstractAnimal.getMove()));
    System.out.println();

    // Display all animals the breath with Lungs
    System.out.println("Filter by animals that breath with lungs");
    List<AbstractAnimal> withLungList = filterAbstractAnimal(animals, (a) -> a.getBreath() == "Lungs");
    withLungList.forEach((a) -> System.out.println(a));
    System.out.println();

    // Display all animals that breath with lungs and were named in 1758
    System.out.println("Filter by animals that breath with Lungs and were name in 1758");
    List<AbstractAnimal> lungs1758 = filterAbstractAnimal(withLungList, (a) -> a.getYear() == 1758);
    lungs1758.forEach((animal1758) -> System.out.println(animal1758));
    System.out.println();

    // Display all animals that breath with lungs and lay Eggs
    System.out.println("Filter by animals that breath with Lungs and lay Eggs");
    List<AbstractAnimal> lungsEggs = filterAbstractAnimal(withLungList, (a) -> a.getReproduce() == "Eggs");
    lungsEggs.forEach((animal) -> System.out.println(animal));
    System.out.println();

    // Display alphabetically animals named in 1758
    System.out.println("Display alphabetically animals named in 1758");
    List<AbstractAnimal> animals1758 = filterAbstractAnimal(animals, (a) -> a.getYear() == 1758);
    animals1758.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    animals1758.forEach((an) -> System.out.println(an));
    System.out.println();
  }
}
