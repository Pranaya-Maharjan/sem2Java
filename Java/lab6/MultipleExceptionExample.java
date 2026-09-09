public class MultipleExceptionExample{
	public static void main(String[] args){
		try{
			int oddNumbers[]={11,13,15,17,19,21};
			System.out.println("Accessing element at index 5: " + oddNumbers[5]);
			String price = "1200.s120";
			double discount = 250.00;
			double finalPrice = Double.parseDouble(price) - discount;
			System.out.println("Final Price: " + finalPrice);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBountsException occurred: " + e.getMessage());
		} catch (NumberFormatException ne){
			System.out.println("NumberFormatException occurred: " + ne.getMessage());
		} finally {
			System.out.println("Finally block executed.");
		}
	}
}
