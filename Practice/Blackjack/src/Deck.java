import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Класс для создания колоды и перемешивания
public class Deck {
    private final List<Card> cards = new ArrayList<>();

    // Создание колоды с помощью перебора всех значений карт как раз должно 52 варианта получиться
    public Deck() {
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        // Специальный метод перемешивания массивов
        Collections.shuffle(cards);
    }
    // Раздача и удаление
    public Card dealCard() {
        return cards.remove(0);
    }
}

