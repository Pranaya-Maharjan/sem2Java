public class CustomExceptionExample extends Exception{
	public CustomExceptionExample(String message){
		super(message);
	}
	public void quotation(String quote) throws CustomExceptionExample{
		if (quote == null || quote.isEmpty()){
			throw new CustomExceptionExample("Exception: "+ super.getMessage());
		} else{
			System.out.println("Quote : " + quote);
		}
	}
	public static void main(String[] args){
		CustomExceptionExample ce = new CustomExceptionExample("Quote cannot be null.");
		try {
			System.out.println("Calling quotation method with a valid quote.");
			ce.quotation("Happy Belated Raksha Bandhan to all.");
			System.out.println("Calling quotation method with a null quote.");
			ce.quotation(null);
		} catch(CustomExceptionExample e){
			System.out.println(e.getMessage());
		}
	}
}
