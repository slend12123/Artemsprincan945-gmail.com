import java.util.Arrays;
import java.util.Random;

public class Task3 {
  public static void main(String[] args) {
    Random random = new Random();
    int sum = 0;
    int maxSum = Integer.MIN_VALUE;
    int indexMaxSum = 0;
    int[][] arr = new int[12][8];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = random.nextInt(51);
        sum += arr[i][j];
      }
      if (sum > maxSum) {
        maxSum = sum;
        indexMaxSum = i;
      }
      System.out.println(Arrays.toString(arr[i]) + " // сумма - " + sum);
      sum = 0;
    }
    System.out.println("Ответ: " + indexMaxSum);
  }
}
