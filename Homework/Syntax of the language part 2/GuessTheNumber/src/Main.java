import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int value = new Random().nextInt(100 + 1);
            System.out.println("Угадай загаданное число за 7 попыток");
            int attempts = 0;
            boolean continuation = false;
            while (attempts < 7) {
                attempts++;
                int attempt = new Scanner(System.in).nextInt();
                if (attempt < value) {
                    System.out.println("Загаданное число больше");
                } else if (attempt > value) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Вы угадали!");
                    continuation = true;
                }
            }
            if (!continuation) {
                System.out.println("Вы проиграли\nЗагаданное число было: " + value);
            }
            System.out.println("Хотите сыграть еще раз? да/нет");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("нет")) {
                System.out.println("Спасибо за игру!");
                break;
            }
        }
    }
}