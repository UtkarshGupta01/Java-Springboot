// introduction to Sets

import java.util.*;

public class TestingSets {
  public static void main(String[] args) {
    Set<Double> marks = new HashSet<>();
    marks.add(34.12);
    marks.add(123.32);
    marks.add(234.213);
    System.out.println("Size of set before inserting double : " + marks.size());
    marks.add(34.12);
    System.out.println("Size of set after inserting double : " + marks.size());

    for (Double m : marks) {
      System.out.println(m);
    }

    System.out.println(marks.contains(123.32));
    System.out.println(marks.isEmpty());

  }

}