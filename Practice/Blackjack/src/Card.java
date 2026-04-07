// Класс для создания карт
public class Card {
    // Масти и их имена
    public enum Suit {
        HEARTS("Червей"),
        DIAMONDS("Бубей"),
        CLUBS("Крестей"),
        SPADES("Пик");
        private final String nameSuit;
        Suit(String nameSuit) {
            this.nameSuit = nameSuit;
        }
        public String getNameSuit() {
            return nameSuit;
        }
    }
    // Ранги, имена и их значения
    public enum Rank {
        TWO("Двойка",2),
        THREE("Тройка",3),
        FOUR("Четверка",4),
        FIVE("Пятерка",5),
        SIX("Шестерка",6),
        SEVEN("Семерка",7),
        EIGHT("Восьмерка",8),
        NINE("Девятка",9),
        TEN("Десятка",10),
        JACK("Валет",10),
        QUEEN("Дама",10),
        KING("Король",10),
        ACE("Туз",11);
        private final int value;
        private final String nameRank;
        Rank(String name, int value) {
            this.value = value;
            this.nameRank = name;
        }
        public int getValue() {
            return value;
        }
        public String getNameRank() {
            return nameRank;
        }
    }
    // Поля конструктора
    private final Suit suit;
    private final Rank rank;
    // Конструктор карт
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    // Получить значение
    public int getValue() {
        return rank.getValue();
    }
    // Текстовый вывод
    @Override
    public String toString() {
        return rank.nameRank + ' ' + suit.nameSuit;
    }
}
