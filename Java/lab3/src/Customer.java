public class Customer{
	int customer_id;
	String full_name;
	String contact;
	public Customer(int id, String name, String contact){
		this.customer_id=id;
		this.full_name=name;
		this.contact=contact;
	}
	public void showCustomerDetail(){
		System.out.println("Customer ID:"+ this.customer_id);
		System.out.println("Customer Name:" + this.full_name);
		System.out.println("Customer Contact:"+this.contact);
	}
}	

