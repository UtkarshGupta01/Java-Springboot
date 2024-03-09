// Introduction to If-Else Statements

public class IfElse {
  public static void main(String[] args) {
    int price = 240;

    if (price <= 100) {
      System.out.println("You can buy the toy :)");
    } else if (price > 100 && price < 300) {
      System.out.println("You can not buy the toy yet...");
      System.out.println("Collect more money and come back later ;)");
    } else {
      System.out.println("You can never buy the toy!!!");
    }

  }

}
