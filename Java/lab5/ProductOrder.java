public abstract class ProductOrder  {

    public abstract void placeOrder(int order_code, String date, Product p, int quantity);

    public abstract String[] getOrderDetail();

    public void info() {
        System.out.println("This is an abstract class for Product business logic.");
    }
}
