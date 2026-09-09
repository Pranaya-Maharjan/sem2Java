public class ArithmeticExceptionExample{
	public void doDivision(double a, double b) throws ArithmeticException{
		if (b==0){
			throw new ArithmeticException("Division by zero is not allowed.");
		} else{
			double result = a/b;
			System.out.println("result: " + result);
		}
	}
	public static void main(String[] args){
		System.out.println("ArithmeticException Example with throw and throws keywords");
		try{
			ArithmeticExceptionExample example = new ArithmeticExceptionExample();
			System.out.println("Calling doDivision with 10 and 5");
			example.doDivision(10,5);
			System.out.println("Calling doDivision with 10 and 0");
			example.doDivision(10,0);
		} catch (ArithmeticException e){
			System.out.println("ArithmeticException occured: " + e.getMessage());
		}
	}
}
