import java.io.File;

public class FileDelete {
  public static void main(String[] args) {
    try {
      File myFile = new File("../learning-java.txt");
      if (myFile.delete()) {
        System.out.println("File Deleted : " + myFile.getName());
      }

    } catch (Exception e) {
      System.out.println("Error caught : " + e.getMessage());

    }
  }

}
