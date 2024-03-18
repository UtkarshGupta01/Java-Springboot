// Introduction to Abstraction

abstract class Animal {
  String name;

  abstract public String animal();

  Animal() {
    System.out.println("You are creating a animal");
  }
}

class Lion extends Animal {
  public void printName() {
    System.out.println("Name of Animal : " + this.name);
  }

  public String animal() { // Must define after defining abstract functions
    return "Animals :";
  }
}

public class Abstraction {
  public static void main(String[] args) {
    // Animal a = new Animal(); //Will give compile error

    Lion l = new Lion();
    l.name = "Sheru";
    System.out.println(l.animal());
    l.printName();
  }

}
