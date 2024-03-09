// A number guessing game where random number is generated randomly between 1 - 100. The system will tell whether the number guessed by the user is less or greater than number generated and the user have only few chances. The user can also type -1 to stop playing. 

import java.util.Scanner;
import java.lang.Math;

public class GuessTheNumber {

  public static void game(int pcNumber, int userNumber) {

  }

  public static void main(String[] args) {

    int chances = 10;
    int generatedNumber = (int) (Math.random() * 100);
    Scanner user = new Scanner(System.in);

    System.out.println("================== Welcome to the Number Guessing Game ==================");
    System.out.println("Guess the correct number between 0 - 100...");
    System.out.println("You only have " + chances + " chances!");
    System.out.println("Enter -1 to quit.");

    while (chances > 0) {
      System.out.print("Take a guess : ");
      int userNumber = user.nextInt();

      if (userNumber == -1) {
        System.out.println("You quit :(");
        System.out.println("The correct number is " + generatedNumber);
        System.out.println("Thanks for Playing :)");
        break;

      } else if (userNumber < generatedNumber && userNumber >= 0) {
        System.out.println("Actual number is GREATER :| . Try number greater than " + userNumber);

      } else if (userNumber > generatedNumber && userNumber <= 100) {
        System.out.println("Actual number is LESS :| . Try number less than " + userNumber);

      } else if (userNumber == generatedNumber) {
        System.out.println("Yayy !! Your guess is correct!");
        System.out.println("You Won ^o^");
        System.out.println("Thanks for Playing :)");
        break;

      } else {
        System.out.println("Guessed number is out of limits. Please guess a number between 0 - 100");
      }

      chances--;

      System.out.println("You have " + chances + " left!");

      if (chances == 0) {
        System.out.println("You lost :'(");
        System.out.println("The correct number is " + generatedNumber);
        System.out.println("Thanks for Playing :)");

      }

    }
    user.close();
  }
}
