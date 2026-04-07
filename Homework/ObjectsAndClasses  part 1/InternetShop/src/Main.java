public class Main {
    public static void main(String[] args) {
        Basket vasyaBasket = new Basket(7000);
        vasyaBasket.add("Молоко", 80,3,1.0);
        vasyaBasket.add("Хлеб", 40,2,1.0);

        Basket petyaBasket = new Basket(5000);
        petyaBasket.add("Лопата", 280,3,3.0);
        petyaBasket.add("Бочка", 2900,2,7.0);

        Basket mashaBasket = new Basket(5000);
        mashaBasket.add("Стол", 0, 3,4.0);
        mashaBasket.add("Стул", 0, 2,3.0);


        vasyaBasket.print("\nКорзина Васи: " + "\nСумма " + vasyaBasket.getTotalPrice() +
                "\nВес " + vasyaBasket.getTotalWeight());
        petyaBasket.print("\nКорзина Пети:" + "\nСумма " + petyaBasket.getTotalPrice() +
                "\nВес " + petyaBasket.getTotalWeight());
        mashaBasket.print("\nКорзина Маши:" + "\nСумма " + mashaBasket.getTotalPrice() +
                "\nВес " + mashaBasket.getTotalWeight());

    }
}
