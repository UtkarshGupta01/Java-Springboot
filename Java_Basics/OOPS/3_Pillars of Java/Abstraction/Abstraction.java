// Introduction to Abstraction

abstract class Animal {
  String name;

  abstract public String animal();
}

class Lion extends Animal {
  public void printName() {
    System.out.println(this.name);
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
