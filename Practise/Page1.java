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
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number to check whether its armstrong number or not
// : ");
// int num = input.nextInt();
// if (armstrongChecker(num)) {
// System.out.println("It's an armstrong number");
// } else {
// System.out.println("It's not an armstrong number");
// }
// input.close();
// }
// static boolean armstrongChecker(int n) {
// int sum = 0;
// int originalNum = n;
// while (n != 0) {
// int remainder = n % 10;
// sum += (int) Math.pow(remainder, 3);
// n = n / 10;
// }
// if (originalNum == sum) {
// return true;
// } else {
// return false;
// }
// }
// }

// ==================================================================================

// Palindrome

// import java.util.Scanner;
// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number to check whether its Palindrome or not : ");
// int num = input.nextInt();
// if (palindromeChecker(num)) {
// System.out.println("It's a Palindrome");
// } else {
// System.out.println("It's not a Palindrome");
// }
// input.close();
// }

// static boolean palindromeChecker(int n) {
// int reverse = 0;
// int originalNum = n;
// while (n != 0) {
// int remainder = n % 10;
// reverse = (reverse * 10) + remainder;
// n = n / 10;
// }
// if (originalNum == reverse) {
// return true;
// } else {
// return false;
// }
// }
// }

// ===================================================================================

// Fabonacci Series

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter a number to which you want fabonacci Series : ");
// int num = input.nextInt();
// fabonacci(num);
// input.close();
// }

// static void fabonacci(int n) {
// int a = 0;
// int b = 1;
// int temp = 0;

// System.out.print(a + " " + b + " ");
// while (a + b <= n) {
// temp = b;
// b = a + b;
// a = temp;
// System.out.print(b + " ");
// }
// }
// }

// =================================================================================

// Patterns
// *
// **
// ***

// import java.util.Scanner;
// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the length of pattern : ");
// int num = input.nextInt();
// pattern(num);
// input.close();
// }

// static void pattern(int n) {
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println("");
// }

// }
// }

// --------------------------

// ***
// **
// *

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the length of pattern : ");
// int num = input.nextInt();
// pattern(num);
// input.close();
// }

// static void pattern(int n) {
// for (int i = n; i >= 1; i--) {
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println("");
// }

// }
// }

// -------------------------

// *
// **
// ***

// import java.util.Scanner;

// public class Page1 {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter the length of pattern : ");
// int num = input.nextInt();
// pattern(num);
// input.close();
// }

// static void pattern(int n) {
// for (int i = 1; i <= n; i++) {
// for (int k = 0; k < n - i; k++) {
// System.out.print(" ");
// }
// for (int j = 1; j <= i; j++) {
// System.out.print("*");
// }
// System.out.println();
// }

// }
// }

// ================================ X ===================================

// Sum and average of all elements in an array

// public class Page2 {
// public static void main(String[] args) {
// int[] arr = { 21, 3, 2, 12, 12, 7 };
// int sum = 0;
// for (int i : arr) {
// sum += i;
// }
// double avg = (double) sum / arr.length;
// System.out.println("Sum of all elements in an array : " + sum);
// System.out.println("Average of all elements in an array : " + avg);
// }
// }

// ========================================================================

// number of occurrences in a array

// import java.util.*;
// public class Page1 {
// public static void main(String[] args) {
// int[] arr = new int[10];
// Scanner input = new Scanner(System.in);
// System.out.println("Enter any 10 numbers in arrays");
// for (int i = 0; i < arr.length; i++) {
// arr[i] = input.nextInt();
// }
// System.out.println();
// System.out.print("Enter the element you want to count : ");
// int ele = input.nextInt();
// int count = 0;
// for (int i : arr) {
// if (i == ele) {
// count++;
// } else {
// continue;
// }
// }
// if (count > 0) {
// System.out.println("Number of occurrences in array : " + count);
// } else {
// System.out.println("element not present");
// }
// }
// }

// =============================================================================

// sorted array

// public class Page1 {
// public static void main(String[] args) {
// int[] arr = { 1, 21, 3, 141, 511, 911 };
// int count = 0;
// for (int i = 0; i < arr.length - 1; i++) {
// int temp = arr[i];
// if (temp < arr[i + 1]) {
// count++;
// continue;
// } else {
// break;
// }
// }
// if (count == arr.length - 1) {
// System.out.println("sorted");
// } else {
// System.out.println("Not sorted");
// }
// }
// }

// ==============================================================================

// //reverse an array
// public class Page1 {
// public static void main(String[] args) {
// int[] arr = { -1, 32, 12, 3, 4 };
// int start = 0;
// int end = arr.length - 1;
// int temp;
// System.out.println(start + "" + end);
// do {
// temp = arr[start];
// arr[start] = arr[end];
// arr[end] = temp;
// start++;
// end--;

// } while (start < end);

// for (int i : arr) {
// System.out.print(" " + i);

// }
// }
// }

// ===============================================================================

// array palindrome

// import java.util.Arrays;
// public class Page1 {
// public static void main(String[] args) {
// int[] a_arr = { 1, 2, 3, 2, 1 };
// int i = a_arr.length - 1;
// int[] b_arr = new int[a_arr.length];
// int j = 0;

// while (j < b_arr.length) {
// b_arr[j] = a_arr[i];
// i--;
// j++;
// }

// if (Arrays.equals(a_arr, b_arr)) {
// System.out.println("It's a Palindrome");
// } else {
// System.out.println("It's not a palindrone");
// }
// }
// }

// ===========================================================================

// Merge two sorted arrays

// public class Page1 {
// public static void main(String[] args) {
// int a[] = { 2, 4, 7, 8, 56 };
// int b[] = { 12, 24, 34, 42, 73 };
// int c[] = new int[a.length + b.length];
// int i = 0;
// int j = 0;
// int k = 0;
// while (i < a.length && j < b.length) {
// if (a[i] < b[j]) {
// c[k] = a[i];
// i++;
// } else {
// c[k] = b[j];
// j++;
// }
// k++;
// }
// while (i < a.length) {
// c[k] = a[i];
// i++;
// k++;
// }
// while (j < b.length) {
// c[k] = b[j];
// j++;
// k++;
// }
// for (int x : c) {
// System.out.print(x + " ");
// }
// }
// }

// ==============================================================================

// search element in 2d array

// public class Page1 {
// public static void main(String[] args) {
// int arr[][] = { { 12, 32, 312, 3 }, { 65, 213, 2, 678 } };
// int ans[] = new int[2];
// int target = 213;
// boolean found = false;
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr[i].length; j++) {
// if (arr[i][j] == target) {
// ans[0] = i;
// ans[1] = j;
// found = true;
// break;
// }
// }
// if (found) { // Exit the outer loop if the target element is found
// break;
// }
// }
// if (found) {
// System.out.println("Element is present at position " + ans[0] + ", " +
// ans[1]);
// } else {
// System.out.println("Element is not present in the array");
// }
// }
// }

// ====================================================================================

//sum and average of all elements in 2d array

// public class Page1 {

//   public static void main(String[] args) {
//     int a[][] = { { 2, 3, 4, 1 }, { 1, 2, 3, 4 } };
//     int sum = 0;
//     int count = 0;
//     for (int i = 0; i < a.length; i++) {
//       for (int j = 0; j < a[i].length; j++) {
//         sum += a[i][j];
//         count++;
//       }
//     }
//     double avg = (double) sum / count;
//     System.out.printf("Sum : %d ; Average : %.2f", sum, avg);

//   }
// }

//=========================================================================

// sum of 2 diagonal elements

public class Page1 {

  public static void main(String[] args) {
    int a[][] = { { 11, 23 }, { 10, 21 } };
    int sum = 0;

    for (int i = 0; i < a.length; i++) {
      int j = i;
      sum += a[i][j];
    }
    System.out.printf("Sum of Two diagonal elements : %d", sum);
  }
}
