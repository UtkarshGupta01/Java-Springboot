class Students {
  String name;
  static String school; // Static variable or functions are like const that cannot be changed by another
                        // class

  public static void changeSchool(String school) {
    school = "Scindia";
  }

}

public class Statics {
  public static void main(String[] args) {
    Students.school = "DPS"; // input value in static varible by accessing it directly via class;
    Students s1 = new Students();
    s1.name = "Michael";
    System.out.println("Name : " + s1.name);
    System.out.println("School : " + s1.school);
  }

}
