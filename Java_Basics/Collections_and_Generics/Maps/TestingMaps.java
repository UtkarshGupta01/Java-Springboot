import java.util.*;

public class TestingMaps {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(90, "Aman");
    map.put(19, "Anjali");

    System.out.println(map.size());
    System.out.println(map.get(19));
    System.out.println(map.containsKey(12));
    System.out.println(map.containsValue("Anjali"));
    System.out.println(map.values());
    System.out.println("Removed Value : " + map.remove(19));
    System.out.println(map.values());

  }
}