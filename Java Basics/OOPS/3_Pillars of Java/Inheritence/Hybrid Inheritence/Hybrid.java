// Hybrid Inheritence : Animal => Dog => Husky | Animal => Cat

class Animal {
  boolean isPet;
  String lang;

}

class Dog extends Animal {

  String color;

  public void printInfo() {
    System.out.println("Dog : " + lang);
    System.out.println("Can be pet ? " + isPet);
  }
}

class Cat extends Animal {

  public void printInfo() {
    System.out.println("Cat : " + lang);
    System.out.println("Can be pet ? " + isPet);
  }

}

class Husky extends Dog {

  public void printColourInfo() {
    System.out.println("Colour of Husky: " + color);
  }

}

public class Hybrid {
  public static void main(String[] args) {

    Husky h = new Husky();
    h.isPet = true;
    h.lang = "Barks";
    h.color = "White";
    h.printInfo();
    h.printColourInfo();

    Cat c = new Cat();
    c.isPet = true;
    c.lang = "Meaw";
    c.printInfo();

  }

}
