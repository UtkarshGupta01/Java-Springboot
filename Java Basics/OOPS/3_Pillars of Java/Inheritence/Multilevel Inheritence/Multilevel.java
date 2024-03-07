// Multilevel Inheritence : Animal => Dog => Husky

class Animal {
  boolean isPet;

}

class Dog extends Animal {
  String color;

  public void printPetInfo() {
    System.out.println("Can be pet ? " + isPet);
  }
}

class Husky extends Dog {

  public void printColourInfo() {
    System.out.println("Colour : " + color);
  }

}

public class Multilevel {
  public static void main(String[] args) {
    Husky h = new Husky();
    h.isPet = true;
    h.color = "White + Grey";

    h.printPetInfo();
    h.printColourInfo();

  }

}
