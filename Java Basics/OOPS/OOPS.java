// Introduction to OOPs concept

class Student {
  String name;
  int age;
  boolean isSmart;

  public void studentDetails() {
    System.out.println("Student Name : " + this.name);
    System.out.println("Student Age : " + this.age);
    System.out.println("Is Student smart ? " + this.isSmart);

  }
}

public class OOPS {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Utkarsh";
    s1.age = 22;
    s1.isSmart = true;

    Student s2 = new Student();
    s2.name = "Varun";
    s2.age = 22;
    s2.isSmart = false;

    s1.studentDetails();
    s2.studentDetails();

  }

}
