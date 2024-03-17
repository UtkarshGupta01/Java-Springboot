//Introduction to Enums 

enum Status {
  GREEN("Go"), YELLOW("Wait"), RED("Stop");

  String action;

  Status(String a) {
    this.action = a;
  }

}

public class TestingEnums {
  public static void main(String[] args) {
    Status s = Status.RED;

    switch (s) {
      case GREEN:
        System.out.println("Light is " + s + ". It means " + s.action);
        break;
      case YELLOW:
        System.out.println("Light is " + s + ". It means " + s.action);
        break;
      case RED:
        System.out.println("Light is " + s + ". It means " + s.action);
        break;

      default:
        System.out.println("Invalid Light");

        break;
    }

  }

}
