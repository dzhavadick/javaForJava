import java.util.ArrayList;
import java.util.List;
// Класс для вывода карт на руках игроков
public class Hand {
    private final List<Card> cards = new ArrayList<>();
    // Добавить карту
    public void addCard(Card card) {
        cards.add(card);
    }
    // Получить карту по индексу (для отображения скрытых карт)
    public Card getCard(int index) {
        return cards.get(index);
    }
    // Рассчитать стоимость руки
    public int getValue() {
        int sum = 0;
        int ace = 0;
        // Туз = 11
        for (Card card : cards) {
            sum += card.getValue();
            if (card.getValue() == 11)  ace++;
        }
        // Туз = 1 если перебор
        while (sum > 21 && ace > 0) {
            sum -= 10;
            ace--;
        }
        return sum;
    }
    // Отображение
    @Override
    public String toString() {
        return cards.toString() + " || Количество очков (" + getValue() + ") ||";
    }
}
