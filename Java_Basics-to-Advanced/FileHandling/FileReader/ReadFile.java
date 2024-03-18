
import java.io.File;
import java.util.Scanner;

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myFile = new File("../learning-java.txt");
      Scanner file = new Scanner(myFile);
      while (file.hasNextLine()) {
        String data = file.nextLine();
        System.out.println(data);

      }
      file.close();

    } catch (Exception e) {
      System.out.println("Error caught : " + e.getMessage());
    }
  }

}
