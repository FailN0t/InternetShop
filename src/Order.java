public class Order {
    private int count = 0;

    public void addProducts(int productsCount){
        count += productsCount;
    }

    public int getProductsCount(){
        return count;
    }

}
