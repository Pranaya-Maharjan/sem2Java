public class ProductOrderManager extends ProductOrder{
    private Product p;
    public int order_code;
    public String date;
    public int quantity;

    @Override
    public void placeOrder(int code, String date,Product p, int quantity){
        this.order_code = code;
        this.date = date;
        this.p = p;
        this.quantity = quantity;
        System.out.println("This is an abstract class for Product business logic.");
    }
    @Override
    public String[] getOrderDetail(){
        String code = String.valueOf(this.order_code);
        String title = this.p.getTitle();
        String description = String.valueOf(this.p.getDescription());
        String price = String.valueOf(this.p.getPrice());
        String qty = String.valueOf(this.quantity);
        String[] orderDetails = {code, title, description,price, qty};
        return orderDetails;
    }
}
