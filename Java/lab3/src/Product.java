public class Product{
	int product_id;
	String title;
	String description;
	double price;
	int quantity;
	String category;
	Product product_list[][];
	public Product(int id, String title, String desc, double price, int quantity, String category){
		this.product_id=id;
		this.title=title;
		this.description=desc;
		this.price=price;
		this.quantity=quantity;
		this.category=category;
	}
	public void showProductDetail(){
		System.out.println("Product ID:"+product_id);
		System.out.println("Product Title:"+title);
		System.out.println("Description:"+description);
		System.out.println("Product Quantity:"+quantity);
		System.out.println("Product Price:"+price);
		System.out.println("Product Category:"+category);
	}
}
