// Introduction to Interface which is a pure form of abstraction

interface Carnivores {
  // All the fields in interface are public static and final by default
  // All the methods/functions here are public and abstract by default

  int c_count = 30; // Cannot define empty variable in interface

  void type();

}

interface Herbivores {
  int h_count = 50;

  void type();
}

// Interfaces also allow Multiple Inheritence in java

class Animals implements Carnivores, Herbivores {
  public void type() {
    System.out.println("Aerials");
  }

}

public class Interface {
  public static void main(String[] args) {
    Animals a1 = new Animals();
    a1.type();
    System.out.println("Number of carnivores : " + Animals.c_count);
    System.out.println("Number of Herbivores : " + Animals.h_count);

  }

}
