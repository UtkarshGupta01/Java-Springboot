// Introduction to Static and Final keyword

class Students {
  String name;
  static String school; // Static variables belong to the class only and cannot be accessed by another
                        // class

  final int salary = 120000; // Final is used to declare the final value of variable which cannot be changed
                             // later

  public static void changeSchool(String school) {
    school = "Scindia";
  }

}

public class Statics {
  public static void main(String[] args) {
    Students.school = "DPS"; // input value in static varible by accessing it directly via class;
    Students s1 = new Students();
    s1.name = "Michael";
    // s1.salary = 20000; // gives an error
    System.out.println("Name : " + s1.name);
    System.out.println("School : " + s1.school);
    System.out.println("Salary : " + s1.salary);

  }

}
