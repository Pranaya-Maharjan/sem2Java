import java.util.Scanner;
public class ScannerExample{
	public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the following required details:");
		System.out.println("Enter your a/c no:");
		int acno = sc.nextInt();
		System.out.println("Enter your preferred service i.e.: deposit or withdraw:");
		String service = sc.next();
		System.out.println("Enter the amount:");
		double amount = sc.nextDouble();
		System.out.println("Your a/c no is:" + acno);
		System.out.println("Your preferred service is: " + service);
		System.out.println("Your amount is :" + amount);
		System.out.println("Thank you for using our services.");
		sc.close();
	}
}

