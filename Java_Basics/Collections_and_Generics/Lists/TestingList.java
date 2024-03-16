// Introduction to lists

import java.util.*;

public class TestingList {
  public static void main(String[] args) {
    List<String> li = new ArrayList<>();

    // Methods of List
    li.add("Utkarsh");
    li.add("Gupta");
    li.add(1, "Kumar");

    li.remove(0);
    li.set(0, "Utkarsh");

    for (int i = 0; i < li.size(); i++) {
      System.out.println(li.get(i));
    }

    if (li.contains("Gupta")) {
      System.out.println(li.indexOf("Gupta"));

    }

  }

}
