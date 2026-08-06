#! /usr/bin/env -S java --source 26
import java.util.Scanner;
public class Parm{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of a rectangle:");
        double l =sc.nextDouble() ;
        double b =sc.nextDouble();
        calculateArea(l,b);
    }
    public static void calculateArea(double l, double b){
        double area = l*b;
        System.out.println("The area of rectangle having length" + l+ "and breadth" + b+ "is" + area);
    }
}
