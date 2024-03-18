import java.io.FileWriter;

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myFile = new FileWriter("../learning-java.txt");
      myFile.write("Hey There! I am learning Java. It's Fun");
      myFile.close();
      System.out.println("File Wrote Successfully");

    } catch (Exception e) {
      System.out.println("Caught Error : " + e.getMessage());
    }

  }
}