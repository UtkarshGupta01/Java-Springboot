// Introduction to Funtion Overloading 

class Teacher {

  public void printSubject(String subjects) {
    System.out.println(subjects);
  }

  public void printMarks(int marks) {
    System.out.println(marks);
  }

  public void printDetails(String subjects, int marks) {
    System.out.println(subjects + " : " + marks);
  }
}

public class Overloading {
  public static void main(String[] args) {
    Teacher t1 = new Teacher();
    t1.printSubject("English");
    t1.printMarks(98);
    t1.printDetails("Mathematics", 84);
  }

}
