import java.util.Random;

public class Task2 {
  public static void main(String[] args) {
    Random random = new Random();
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int countMultipleTen = 0;
    int sumMultipleTen = 0;
    int[] array = new int[100];
    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt(10001);
    }
    for (int i : array) {
      if (i > max) max = i;
      if (i < min) min = i;
      if (i % 10 == 0) countMultipleTen++;
      if (i % 10 == 0) sumMultipleTen += i;
    }
    System.out.println("Наибольший элемент массива: " + max);
    System.out.println("Наименьший элемент массива: " + min);
    System.out.println("Количество элементов массива, оканчивающихся на 0: " + countMultipleTen);
    System.out.println("Сумма элементов массива, оканчиввающихся на 0: " + sumMultipleTen);
  }
}
