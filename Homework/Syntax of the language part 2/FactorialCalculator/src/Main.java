import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int result = 1;

        if (number <= 0) {
            System.out.println("Эта программа не работает с нулём или отрицательными числами");
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
            System.out.println(result);
        }
    }
}