import java.io.File;
import java.io.IOException;

public class FileCreate {
  public static void main(String[] args) {
    try {
      File myfile = new File("../learning-java.txt");
      myfile.createNewFile();
      System.out.println("File Created Successfully");
    } catch (IOException e) {
      System.out.println("An error occured");
    }

  }

}
