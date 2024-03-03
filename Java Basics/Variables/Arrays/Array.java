
// Introduction to Arrays
import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    // Initialization
    int[] age = new int[5];
    age[0] = 34;
    age[1] = 12;
    age[2] = 76;
    age[3] = 22;
    age[4] = 19;

    // If we already know the values to be used in arrays we ca also declare array
    // as
    int[] new_age = { 43, 112, 432, 12, 1213, 123 };

    // Read Values
    System.out.println("Age : " + age[3]);
    System.out.println("New Age : " + new_age[3]);

    // Methods
    // =>length
    System.out.println("Age : " + age.length);
    System.out.println("New Age : " + new_age.length);

    // =>sort
    Arrays.sort(age);
    Arrays.sort(new_age);
    System.out.println("Age : " + age[3]);
    System.out.println("New Age : " + new_age[3]);

    // 2D Array

    // Initialization
    int[][] marks = { { 54, 23, 11 }, { 98, 67, 87 } };

    // read values
    System.out.println(marks[0][2]);
    System.out.println(marks[1][0]);

  }

}
