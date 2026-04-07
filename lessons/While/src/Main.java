import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secretPin = 4567;
        int pinCode = -1;
        while (pinCode != secretPin) {

            if (pinCode == -1) {
                System.out.println("Введите PIN-код: ");
            } else {
                System.out.println("PIN код введен неверно. Введите верный PIN-код: ");
            }
            pinCode = new Scanner(System.in).nextInt();
        }
        System.out.println("PIN-код введён верно!!!");
    }
}