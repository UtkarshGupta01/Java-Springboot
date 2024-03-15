// Multiplication Table

// import java.util.Scanner;
// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number you want table of : ");
// int table_no = input.nextInt();
// System.out.println("Table of " + table_no + " : ");
// table(table_no);
// input.close();s
// }
// static void table(int num) {
// for (int i = 1; i <= 10; i++) {
// System.out.println(num + " x " + i + " = " + num * i);
// }
// }
// }

// ==================================================================================

// Sum of all odd numbers

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number : ");
// int num = input.nextInt();
// input.close();
// int sum = sumOddNumbers(num);
// System.out.println("Sum of all odd numbers from 1 to " + num + " is " + sum);
// }

// static int sumOddNumbers(int num) {
// int i = 1;
// int sum = 0;
// while (i <= num) {
// sum += i;
// i += 2;

// }
// return sum;
// }
// }

// ===========================================================================

// Calculate Factorial

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number you want the factorial of : ");
// int num = input.nextInt();
// System.out.println(num + "! : " + factorial(num));
// }
// static int factorial(int n) {
// int fact = 1;
// int i = 1;
// if (n == 1) {
// return fact;
// }
// while (i <= n) {
// fact *= i;
// i++;
// }
// return fact;

// }
// }

// ===============================================================================

// Sum of digits of an integer

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number to find sum of its digits : ");
// int num = input.nextInt();
// System.out.println("Sum of digits of " + num + " : " + sum(num));
// }
// static int sum(int n) {
// int digit = 0;
// int sum = 0;
// while (n != 0) {
// digit = n % 10;
// n = n / 10;
// sum += digit;
// }
// return sum;
// }
// }

// =============================================================================

// Prime Number Or not

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number to check whether its prime or not : ");
// int num = input.nextInt();
// if (primeCheck(num)) {
// System.out.println("It is a prime number.");
// } else {
// System.out.println("it is not a prime number. ");
// }
// input.close();

// }

// static boolean primeCheck(int n) {
// for (int i = 2; i < n; i++) {
// if (n % i == 0) {
// return false;
// }

// }
// return true;

// }

// }

// ==========================================================================

// Armstrong Number

// import java.util.Scanner;
// public class Page1 {
//   public static void main(String[] args) {
//     Scanner input = new Scanner(System.in);
//     System.out.print("Enter a number to check whether its armstrong number or not : ");
//     int num = input.nextInt();
//     if (armstrongChecker(num)) {
//       System.out.println("It's an armstrong number");
//     } else {
//       System.out.println("It's not an armstrong number");
//     }
//     input.close();
//   }
//   static boolean armstrongChecker(int n) {
//     int sum = 0;
//     int originalNum = n;
//     while (n != 0) {
//       int remainder = n % 10;
//       sum += (int) Math.pow(remainder, 3);
//       n = n / 10;
//     }
//     if (originalNum == sum) {
//       return true;
//     } else {
//       return false;
//     }
//   }
// }

//==================================================================================

// Palindrome

import java.util.Scanner;

public class Page1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to check whether its Palindrome or not : ");
    int num = input.nextInt();
    if (palindromeChecker(num)) {
      System.out.println("It's a Palindrome");
    } else {
      System.out.println("It's not a Palindrome");
    }
    input.close();
  }

  static boolean palindromeChecker(int n) {
    int reverse = 0;
    int originalNum = n;
    while (n != 0) {
      int remainder = n % 10;
      reverse = (reverse * 10) + remainder;
      n = n / 10;
    }
    if (originalNum == reverse) {
      return true;
    } else {
      return false;
    }
  }
}