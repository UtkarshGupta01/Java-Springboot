// Introduction to Variable arguments

public class VarArgs {
  public static void main(String[] args) {
    System.out.println(sum(4, 2, 2, 2, 3, 2));
  }

  static int sum(int... a) {
    int sum = 0;
    for (int i : a) {
      sum += i;
    }
    return sum;

  }
}
