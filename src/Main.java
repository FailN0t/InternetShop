public class Main {
    public static void main(String[] args) {
        Basket vasyaBasKet = new Basket();
        vasyaBasKet.add("Молоко", 80);
        vasyaBasKet.add("Хлеб", 40);

        Basket petyaBasket = new Basket(500);
        petyaBasket.add("Лопата", 280);
        petyaBasket.add("Бочка", 2900);

        vasyaBasKet.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");

        Basket mashaBasket = new Basket("\nСтол - " + 5000, 5000);
        mashaBasket.print("Корзина Маши: ");

    }
}
