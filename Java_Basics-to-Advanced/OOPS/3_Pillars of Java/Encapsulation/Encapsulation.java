// Introduction to Encapsulation

class Student {
  public String name;
  private int age;
  private String phone;

  public void getDetails(int age, String phone) {
    setInfo(age, phone);
    System.out.println("Name : " + this.name);
    System.out.println("Age : " + getAge());
    System.out.println("Phone Number : " + this.phone);

  }

  private void setInfo(int age, String phone) {
    this.age = age;
    this.phone = phone;
  }

  private int getAge() {
    return this.age;
  }

}

public class Encapsulation {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Sagar";
    s1.getDetails(26, "1234567890");
  }

}
