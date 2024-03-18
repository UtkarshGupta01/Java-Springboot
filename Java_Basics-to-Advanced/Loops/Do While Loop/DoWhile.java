public class DoWhile {
  public static void main(String[] args) {
    int i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i <= 10);

    // Example

    i = 1;
    int n = 134;
    System.out.println("Table of 134 : ");
    do {
      System.out.println(n + " x " + i + " = " + n * i);
      i++;
    } while (i <= 10);

  }
}