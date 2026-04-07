import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int number = new Scanner(System.in).nextInt();

        for (int a = 1; a <= number; a++) {
            for (int b = number; b >= 1; b--) {
                if (a * b == number) {
                    System.out.println(a + "*" + b);
                }
            }
        }
    }
}