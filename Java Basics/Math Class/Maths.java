// Introduction to Math Class which provide different Matematical Operations

import java.lang.Math;

public class Maths {
  public static void main(String[] args) {
    int a = 54;
    int v = 23;
    float c = 23.12F;

    // max
    System.out.println("Max : " + Math.max(a, v));

    // min
    System.out.println("Min : " + Math.min(v, c));

    // random
    System.out.println(Math.random()); // will give random number between 0 to 1

    System.out.println((int) (Math.random() * 10)); // will give random number between 1 to 10

  }

}
