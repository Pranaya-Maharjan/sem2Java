public class Product {
    private int id;
    private String title;
    private String description;
    private double price;
    private int quantity;
    public int getId() {
        return id;
    }
    public void setId(int param_id) {
        this.id = param_id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String param_title) {
        this.title = param_title;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String param_description) {
        this.description = param_description;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double param_price) {
        this.price = param_price;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setQuantity(int param_quantity) {
        this.quantity = param_quantity;
    }
}
