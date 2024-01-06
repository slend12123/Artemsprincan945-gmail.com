import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b){
            System.out.println("Некорректный ввод");
        } else {
            while (a < b){
                if (a % 5 == 0 && a % 10 != 0){
                    System.out.println(a);
                }
                a++;
            }
        }
    }
}
