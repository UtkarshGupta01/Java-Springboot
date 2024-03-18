// Setting pririty in a thread

class MyThread1 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.printf("Hello, I am " + Thread.currentThread().getName());
      System.out.println("# " + i);
    }
  }
}

class MyThread2 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.printf("Hello, I  am " + Thread.currentThread().getName());
      System.out.println("* " + i);
    }
  }
}

class MyThread3 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.printf("Hello, I am " + Thread.currentThread().getName());
      System.out.println("! " + i);
    }
  }
}

public class SettingPriority {
  public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    MyThread3 t3 = new MyThread3();
    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);
    t1.start();
    t2.start();
    t3.start();

  }

}
