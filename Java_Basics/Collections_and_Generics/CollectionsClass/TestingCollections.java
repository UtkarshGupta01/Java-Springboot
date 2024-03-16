// Introduction to Collections Class

import java.util.*;

public class TestingCollections {
  public static void main(String[] args) {
    List<Integer> marks = new ArrayList<>();
    marks.add(23);
    marks.add(231);
    marks.add(12);
    marks.add(-1);
    marks.add(-1323);

    Collections.sort(marks);
    print(marks, "Sorted : ");

    Collections.reverse(marks);
    print(marks, "Reversed  :");

    System.out.println("Max : " + Collections.max(marks));
    System.out.println("Min : " + Collections.min(marks));

  }

  static void print(List<Integer> marks, String type) {
    System.out.print(type);
    for (Integer m : marks) {
      System.out.print(m + " ");

    }
    System.out.println();
  }

}
