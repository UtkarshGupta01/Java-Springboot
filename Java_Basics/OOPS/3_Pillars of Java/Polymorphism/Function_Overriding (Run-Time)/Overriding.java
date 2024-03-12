// Introduction to Method Overriding
class Quadrilaterals {
  void type() {
    System.out.println("Don't know the type");
  }
}

class Square extends Quadrilaterals {
  void type() { // This method is override
    System.out.println("It's a Square");
  }
}

public class Overriding {
  public static void main(String[] args) {
    Square s = new Square();
    s.type();

  }

}
