// Introduction to Switch Statements

public class Switch {
  public static void main(String[] args) {
    String color = "blue";

    switch (color) {
      case "red":
        System.out.println("Colour is red");
        break;
      case "blue":
        System.out.println("Colour is not red");
        break;
      default:
        System.out.println("Unknown colour");
    }
  }

}
