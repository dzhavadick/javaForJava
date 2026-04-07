
public class Main {
    public static void main(String[] args) {
        int milkAmount = 2000; // ml
        int powderAmount = 500; // g
        int eggsCount = 300; // items
        int sugarAmount = 500; // g
        int oilAmount = 300; // ml
        int appleCount = 800; // items

        boolean appleJuice = appleCount >= 5;
        boolean pancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;
        boolean omelette = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5;
        boolean applePie = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4;

        // Example
        // apples - 5
        if (appleJuice) {
            System.out.println("Apple juice");
        }

        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (pancakes) {
            System.out.println("Pancakes");
        }

        // milk - 300 ml, powder - 5 g, eggs - 5
        if (omelette) {
            System.out.println("Omelette");
        }

        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (applePie) {
            System.out.println("Apple pie");
        }

    }
}
