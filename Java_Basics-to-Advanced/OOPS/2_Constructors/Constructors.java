// Introduction to Constructors in class and its types

class Cars {
  String color;
  int price;

  // ================Non Parameterized Constructors

  /*
   * Cars() {
   * System.out.println("Construction Called");
   * }
   */

  // ==================Parameterized Constructors

  /*
   * Cars(String color, int price) {
   * // Passing parameters value to class Objects
   * this.color = color;
   * this.price = price;
   * 
   * }
   */

  // ===================Copy Constructors

  Cars(Cars c2) {
    this.color = c2.color;
    this.price = c2.price;
  }

  Cars() {
  }

  public void printInfo() {
    System.out.println(this.color);
    System.out.println(this.price);
  }

}

public class Constructors {
  public static void main(String[] args) {

    // Cars c1 = new Cars("Bue", 2300000); //For Parametrized Constructor
    // c1.printInfo();

    Cars c2 = new Cars();
    c2.color = "Red";
    c2.price = 1000000;

    Cars c3 = new Cars(c2);
    c3.printInfo();
  }

}
