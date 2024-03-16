// Introduction to Queue

import java.util.*;

public class TestingQueue {
  public static void main(String[] args) {
    Queue<Integer> nums = new LinkedList<>();
    nums.add(23);
    nums.add(34);

    for (Integer integer : nums) {
      System.out.println(integer);
    }

    System.out.println(nums.peek());
    System.out.println(nums.remove());

    for (Integer integer : nums) {
      System.out.println(integer);
    }

  }

}
