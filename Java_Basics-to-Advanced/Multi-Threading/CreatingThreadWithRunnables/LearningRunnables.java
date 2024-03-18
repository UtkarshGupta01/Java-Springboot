// Learning to create Thread by implementing runnables

class PrintTask implements Runnable {

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println();
      System.out.printf("Hello, I  am " + Thread.currentThread().getName());
      System.out.printf("%c %d", specialChar, i);
    }
    System.out.println();
    System.out.printf("%s task Completed", Thread.currentThread().getName());
  }

  private final char specialChar;

  public PrintTask(char c) {
    this.specialChar = c;
  }

}

public class LearningRunnables {
  public static void main(String[] args) {
    PrintTask p1 = new PrintTask('@');
    PrintTask p2 = new PrintTask('#');
    PrintTask p3 = new PrintTask('$');

    Thread t1 = new Thread(p1);
    Thread t2 = new Thread(p2);
    Thread t3 = new Thread(p3);

    t1.start();
    t2.start();
    t3.start();

  }

}
