public class BreaknContinue {

  public static void main(String[] args) {
    int i = 10;
    while (true) {
      if (i == 5) {
        i--;
        continue;
      }
      if (i <= 0) {
        break;
      }
      System.out.println(i);
      i--;

    }
  }
}