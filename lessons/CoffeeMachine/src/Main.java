public class Main {
    public static void main(String[] args) {
        int coffeeAmount = 1;
        int milkAmount = 1;
        int skimmedMilkAmount = 1;

        boolean isBlocked = false;

        int cappucinoMilkRequired = 60; //in grams
        int cappucinoCoffeeRequired = 15; //in grams

        boolean milkIsEnough = skimmedMilkAmount >= cappucinoMilkRequired ||
                milkAmount >= cappucinoCoffeeRequired;
        //TODO: check another types of coffee
        boolean coffeeIsEnough =coffeeAmount >= cappucinoMilkRequired;

        boolean hasErrors = false;

        if (!isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            //TODO: some action
            hasErrors = true;
        }

        if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
            hasErrors = true;
        }
        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}