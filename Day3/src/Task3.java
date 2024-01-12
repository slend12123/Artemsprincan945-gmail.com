import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int count = 0;
    while (count < 5) {
      double a = in.nextDouble();
      double b = in.nextDouble();
      if (b == 0) {
        System.out.println("Деление на 0");
        continue;
      }
      System.out.println(a / b);
      count++;
    }
  }
}
