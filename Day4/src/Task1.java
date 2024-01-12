import java.util.Random;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int countMoreEight = 0;
    int countEqualsOne = 0;
    int countEven = 0;
    int countOdd = 0;
    int[] array = new int[in.nextInt()];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(11);
      if (array[i] > 8 ) countMoreEight++;
      if (array[i] == 1 ) countEqualsOne++;
      if (array[i] % 2 == 0 ) countEven++;
      if (array[i] %2 != 0 ) countOdd++;
    }
    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("Длина массива: " + array.length);
    System.out.println("Количество чисел больше 8: " + countMoreEight);
    System.out.println("Количество чисел равных 1: " + countEqualsOne);
    System.out.println("Количество чётных чисел: " + countEven);
    System.out.println("Количество нечётных чисел: " + countOdd);

  }
}
