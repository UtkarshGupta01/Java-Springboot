// Heirarchical Inheritence : Animal => Dog | Animal => Cat

class Animal {
  boolean isPet;
  String lang;

}

class Dog extends Animal {

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

public class Heirarchical {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.isPet = true;
    d.lang = "Barks";
    d.printInfo();

    Cat c = new Cat();
    c.isPet = true;
    c.lang = "Meaw";
    c.printInfo();

  }

}
