// Introduction to how to create a Thread

class MyThread1 extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Hello! Thread 1 here!");
    }
  }
}

class MyThread2 extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Hi! Thread 2 here!");
    }
  }
}

class MyThread3 extends Thread {
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println("Hey! Thread 3 here!");
    }
  }
}

public class CreatingThread {
  public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    MyThread3 t3 = new MyThread3();
    t1.start();
    t2.start();
    t3.start();

  }

}
