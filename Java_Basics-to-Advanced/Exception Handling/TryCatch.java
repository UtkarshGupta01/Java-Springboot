// Introduction to Exception Handling

public class TryCatch {
  public static void main(String[] args) {
    int[] arr = { 12, 2, 1, 323 };

    try {
      System.out.println(arr[8]);
    } catch (Exception exception) {

      // Do something after catching error
      System.out.println("Message : " + exception.getMessage());
    } finally {
      System.out.println("This block will execute whether there is an exception or not!");
    }

    System.out.println("Error Handled :)");
  }

}
