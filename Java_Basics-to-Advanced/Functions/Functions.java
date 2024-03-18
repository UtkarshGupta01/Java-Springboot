// Introduction to Functions

public class Functions {

  public static void printFirstName() {
    System.out.println("Utkarsh");
  }

  public static void printLastName(String lastName) {
    System.out.println(lastName);
  }

  public static void printSum(int a, int b) {
    int sum = a + b;
    System.out.println(sum);
  }

  public static void main(String[] args) {
    printFirstName();
    printLastName("Gupta");
    printSum(65, 12);

  }

}
