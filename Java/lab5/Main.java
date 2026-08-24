public class Main {
    public static void main(String[] args) {
        //Creating new product
        Product p1 = new Product();
        p1.setId(241);
        p1.setTitle("Laptop");
        p1.setDescription("High-performance laptop");
        p1.setPrice(999.99);
        p1.setQuantity(10);
        int code = 1001;
        String date = "2006-08-22";
        int quantity = 2;
        //Creating ProductOrder object based on ProductOrderManager class because ProductOrder is an abstract class and we
        // cannot create object of abstract class
        ProductOrder order = new ProductOrderManager();
        //placing order
        order.placeOrder(code,date,p1,quantity);
        //displaying order details; orderDetail() method returns String array so we will fetch and display using for advanced for loop
        String order_details[] = order.getOrderDetail();
        System.out.println("Order Details:");
        for(int i=0; i< order_details.length; i++){
            System.out.println(order_details[i]);
        }
    }
}
