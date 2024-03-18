// Introduction to Casting
/*
 Types of Casting :
 1) Implicit Casting        
 2) Explicit Casting 
 */

public class Casting {
  public static void main(String[] args) {
    // Implicit Casting
    double price = 30.21;
    double finalPrice = price + 10;

    System.out.println(finalPrice);

    // Explicit Casting
    int costPrice = 60;
    int sellingprice = costPrice + (int) 20.54;

    System.out.println(sellingprice);

  }

}
