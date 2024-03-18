// Single Inheritence : Animal => Dog

class Animal {
  boolean isPet;

}

class Dog extends Animal {
  public void printInfo() {
    System.out.println("Can be pet ? " + isPet);
  }
}

public class Single {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.isPet = true;
    d.printInfo();

  }

}
