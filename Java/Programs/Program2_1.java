import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
public class Program2_1{
	public static void main(String[] args){
		final double SALESTAX = 0.05;
		//input streams for the keyboard and a file
		Scanner fileIn = null;
		//input variables and pricing information
		String product;
		int quantity;
		double unitPrice,quantityPrice,tax,totalPrice;
		char taxStatus;
		//created formatted string for
		//aligning output
		DecimalFormat fmtA = new DecimalFormat("#"), fmtB = new DecimalFormat("$#.00");
		//open the file;catch exception
		//if file not found
		//use regular expression as delimiter
		try{
			fileIn = new Scanner(new FileReader("food.dat"));
			fileIn.useDelimiter("[\t\n\r]+");
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			System.exit(0);
		}
