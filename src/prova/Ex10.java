package prova;

public class Ex10 {
  static int count = 0;

  public static void main(String[] args) {
    if (count < 3) {
      count++;
      increment();
    } else {
      return;
    }
    System.out.println("Hello World!");
  }

  public static void increment() {
    System.out.println("Hello World!");
    count++;
  }

}
