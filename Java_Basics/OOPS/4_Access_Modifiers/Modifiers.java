// Introduction about Access Modifiers in java

/*
 4 types of access modifiers :
 => Public [Accessible by all]
 => Private [Accessible by only that class in which it is defined]
 => Protected [Accessible by all in same package and only accessible by sub-classs in another packages]
 => Default (Not wrting anything before of identifiers, functions or keywords) [Accessible by all only by same packages]

 */

class Animals {
  public String type;
  protected String breed;
  private String nickname;

  public void printInfo() {
    System.out.println("Animal Type : " + this.type);
    System.out.println("Animal Breed : " + this.breed);
  }

  // Here's how we can access private things: with the help of getter and setters

  public void setNickname(String name) { // Setter = use to set value of private things
    this.nickname = name;
  }

  public String getNickname() { // Getter = use to get value of private things
    return this.nickname;

  }
}

public class Modifiers {
  public static void main(String[] args) {
    Animals animal1 = new Animals();
    animal1.type = "Water Animal";
    animal1.breed = "Catfish";
    animal1.setNickname("Squishy");
    // animal1.nickname = "Squishy"; // will give error
    animal1.printInfo();
    System.out.println("Animal Nickname : " + animal1.getNickname());

  }
}