import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

class ScannerProductExample {
    public static void main(String args[]) {
        final double SALESTAX = 0.05;

        Scanner fileIn = null;
        String product;
        int quantity;
        double unitPrice, quantityPrice, tax, totalPrice;
        char taxStatus;

        DecimalFormat fmtA = new DecimalFormat("#");
        DecimalFormat fmtB = new DecimalFormat("$#.00");

        try {
            fileIn = new Scanner(new FileReader("/home/spongybucket/Documents/sem2Java/Java/caseStudy/food.dat"));
            // fileIn.useDelimiter("[\t\n\r]+"); // tab, newline, or carriage return
            fileIn.useDelimiter("\\s+");
        } catch (IOException e) {
            System.err.println("Cannot open file for input.");
            System.exit(1); // it will terminate the program if the file is not found
        }

        System.out.println("Product" + 
                align("Quantity", 16) +
                align("Price", 10) + 
                align(" Total", 12));

        while (fileIn.hasNext()) {
            product = fileIn.next();
            quantity = fileIn.nextInt();
            unitPrice = fileIn.nextDouble();
            taxStatus = fileIn.next().charAt(0);

            quantityPrice = quantity * unitPrice;
            tax = (taxStatus == 'Y') ? quantityPrice * SALESTAX : 0.0;
            totalPrice = quantityPrice + tax;

            System.out.println(product + 
                    align("", 15-product.length()) +
                    align(fmtA.format(quantity), 6) +
                    align(fmtB.format(unitPrice), 13) +
                    align(fmtB.format(totalPrice), 12) +
                    ((taxStatus == 'Y' ? " *" : " ")));
        }
    }

    public static String align(String str, int n) {
        String alignedStr = "";
        for(int i = 1; i < n - str.length(); i++) {
            alignedStr += " ";
        }
        alignedStr += str;
        return alignedStr;
    }
}
