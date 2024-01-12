import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (true) {
      double a = in.nextDouble();
      double b = in.nextDouble();
      if (b == 0) break;
      System.out.println(a / b);
    }
  }
}
