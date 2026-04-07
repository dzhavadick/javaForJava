
import java.util.Scanner;
// Основной класс ввода информации
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();

        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("################################################################################################");
        System.out.println("################################# ДОБРО ПОЖАЛОВАТЬ В BLACKJACK #################################");
        System.out.println("################################################################################################");
        System.out.println("||Ваши карты: " + playerHand);
        System.out.println("||Карты крупье: [СКРЫТА], " + dealerHand.getCard(1));

        if (playerHand.getValue() == 21 && dealerHand.getValue() == 21) {
            System.out.println("Ничья!");
            return;
        } else if (playerHand.getValue() == 21) {
            System.out.println("###################### BlackJack! Вы выиграли! ######################");
            return;
        } else if (dealerHand.getValue() == 21) {
            System.out.println("###################### У крупье BlackJack. Вы проиграли. ######################");
            return;
        }
        while (true) {
            System.out.print("Еще карту? (Ещё/Хватит): ");
            String more = scanner.nextLine().trim();
            if (isHit(more)) {
                playerHand.addCard(deck.dealCard());
                System.out.println("Ваши карты: " + playerHand);
            } else if (isStand(more)) {
                break;
            } else {
                System.out.println("ОШИБКА!!!");
            }
            if (playerHand.getValue() > 21) {
                System.out.println("###################### Перебор! Вы проиграли. ######################");
                return;
            }
        }
        while (dealerHand.getValue() < 17) {
            dealerHand.addCard(deck.dealCard());
        }

        System.out.println("Карты крупье: " + dealerHand);
        if (dealerHand.getValue() > 21 || playerHand.getValue() > dealerHand.getValue()) {
            System.out.println("###################### Вы выиграли! ######################");
        } else if (playerHand.getValue() == dealerHand.getValue()) {
            System.out.println("Ничья!");
        } else {
            System.out.println("###################### Вы проиграли! ###########");
        }
    }

    private static boolean isHit(String input) {
        return "ЕЩЕ".equalsIgnoreCase(input)
                || "ЕЩЁ".equalsIgnoreCase(input)
                || "H".equalsIgnoreCase(input)
                || "HIT".equalsIgnoreCase(input);
    }

    private static boolean isStand(String input) {
        return "ХВАТИТ".equalsIgnoreCase(input)
                || "СТОП".equalsIgnoreCase(input)
                || "S".equalsIgnoreCase(input)
                || "STAND".equalsIgnoreCase(input);
    }
}
