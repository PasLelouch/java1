// Вычислить сумма чисел от 1 до n
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n: ");
        int n = iScanner.nextInt();
        System.out.printf("Сумма чисел от 1 до n равно: %d\n", summa(n));
        iScanner.close();
    }

    public static int summa(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = result + i;
        }
        return result;
    }
}
