// Learning to take input from user

import java.util.Scanner;

public class Input {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Taking int value as input
    System.out.print("Enter your age : ");
    int age = sc.nextInt();

    // Taking float value as input
    System.out.print("Enter the price : ");
    float price = sc.nextFloat();

    // Taking String as input
    System.out.print("Enter your name : ");
    String name = sc.next();

    sc.nextLine();

    // Taking whole line as input
    System.out.print("Enter your wish : ");
    String wish = sc.nextLine();

    sc.close();

    System.out.println("Age : " + age);
    System.out.println("Price : " + price);
    System.out.println("Name : " + name);
    System.out.println("Wish : " + wish);
  }

}
