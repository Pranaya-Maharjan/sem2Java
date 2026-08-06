class Main{
	public void filterProductByCustomer(Object products[][],Customer c){
		for(int i=0;i<products.length;i++){
				if(products[i][0]==c){
					switch(c.customer_id){
						case 1:
							System.out.println("Customer Details:");
							c.showCustomerDetail();
							System.out.println("Products purchased by customer:");
							Product p=(Product) products[i][1];
							p.showProductDetail();
							break;
						case 2:
							System.out.println("Customer Details:");
							c.showCustomerDetail();
							System.out.println("Products purchased by customer:");
							Product p1=(Product) products[i][1];
							p1.showProductDetail();
							break;
					}
				}
		}
		}
	public static void main(String[] args){
		Customer c1=new Customer(1,"rajesh Hamal","9876543210");
		Customer c2=new Customer(2,"Nikita Shrestha","9876543211");
		Product p1=new Product(1,"Gaming Laptop","High performance laptop",1500.00,10,"Electronics");
		Product p2=new Product(2,"Chair","Comfy office chair",15000.00,20,"Furniture");
                Product p3=new Product(3,"Smartphone","Latest model phone",800.00,15,"Electronics");
		Product p4=new Product(4,"Desk","Big size table for computer",10000.00,3,"Furniture");
		Product p5=new Product(5,"Monitor","High resolution OLED screen 400hz refresh rate monitor",100000.00,10,"Electronics");
		Object product_list[][]={
			{c1,p1},
			{c1,p2},
			{c2,p3},
			{c2,p4},
			{c2,p5}};
		Main m=new Main();
		m.filterProductByCustomer(product_list,c1);
		m.filterProductByCustomer(product_list,c2);
	}
}
