

public class Basket {
    private String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;

    public static int getCount(){
        return count;
    }

    public static void increaseCount(int count){
        Basket.count = Basket.count + count;
    }

    public Basket(int limit){
        increaseCount(1);
        this.limit = limit;
    }
    public Basket(String items, int totalPrice){
        increaseCount(1);
        this.items += items;
        this.totalPrice = totalPrice;
    }


    public Basket(){
        increaseCount(1);
        items = "Список товаров";
        limit = 20000;
    }
    public void add(String name, int price){
        add(name, price, 1);
    }

    public void add(int count, String name){
        add(name, -1, count);
    }

    public void add(String name, int price, int count){
        if(contains(name)){
            return;
        }
        if(totalPrice+price >= limit){
            return;
        }
        items += "\n" + name + " - " + count + " шт. - " + price;
        totalPrice += price * count;
    }

    public void clear(){
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    public boolean contains(String name){
        return items.contains(name);
    }
    public void print(String title){
        System.out.println(title);
        if(title.isEmpty()){
            System.out.println("Корзина пуста");
        }else{
            System.out.println(items);
        }
    }
}
