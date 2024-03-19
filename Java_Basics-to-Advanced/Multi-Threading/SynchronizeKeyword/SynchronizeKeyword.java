// Introduction to Synchronize keyword

class Counter {
  private int count = 0;

  public synchronized void increaseCount() {
    count++;
  }

  public int getCount() {
    return count;
  }
}

class UpdaterThread extends Thread {
  private final Counter counter;

  public UpdaterThread(Counter counter) {
    this.counter = counter;
  }

  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increaseCount();
    }
  }
}

public class SynchronizeKeyword {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
    UpdaterThread t1 = new UpdaterThread(counter);
    UpdaterThread t2 = new UpdaterThread(counter);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.printf("Counter Value : %d ", counter.getCount());
  }
}
