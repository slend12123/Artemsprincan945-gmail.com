import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task4 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] arr = new int[100];
    List<Integer> numbers = new ArrayList<>();
    int sum;
    int maxSum = 0;
    int indexMaxSum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(10001);
    }
    for (int i = 1; i < arr.length - 1; i++) {
      sum = arr[i - 1] + arr[i] + arr[i + 1];
      if (sum > maxSum) {
        maxSum = sum;
        indexMaxSum = i - 1;
        numbers.clear();
        for (int j : new int[]{i - 1, i, i + 1}) {
          numbers.add(arr[j]);
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("Тройка с максимальной суммой: " + numbers);
    System.out.println("Максимальная сумма: " + maxSum);
    System.out.println("Индекс первого числа из тройки: " + indexMaxSum);
  }
}
