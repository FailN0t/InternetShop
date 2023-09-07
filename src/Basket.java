

public class Basket {
    private String items = "";
    private int totalPrice = 0;

    private int limit;

    public Basket(int limit){
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice){
        this();
        this.items += items;
        this.totalPrice = totalPrice;
    }

    public Basket(){
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
