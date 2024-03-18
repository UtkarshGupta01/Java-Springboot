// Introduction to Arithmetic Operators

public class Arithmetic {
  public static void main(String[] args) {
    double num1 = 3;
    double num2 = 5;

    // Add
    double sum = num1 + num2;
    System.out.println("Sum : " + sum);

    // Substract
    double diff = num1 - num2;
    System.out.println("Diff : " + diff);

    // Multiply
    double product = num1 * num2;
    System.out.println("Product : " + product);

    // Divide
    double quotient = num1 / num2;
    int quo = (int) num1 / (int) num2;
    System.out.println("(Double) Quotient : " + quotient);
    System.out.println("(Int) Quotient : " + quo);

    // Modulus
    double mod = num1 % num2;
    System.out.println("Mod : " + mod);

  }

}
