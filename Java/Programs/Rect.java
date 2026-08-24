import java.util.Scanner;
public class Rect{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        calculateArea(l,b);
        calculatePeri(l,b);
        sc.close();
    }
    public static void calculateArea(double l , double b){
        double area= l*b;
        System.out.println("Area of rectangle is" + area);
    }
    public static void calculatePeri(double l, double b){
        double peri= 2*(l+b);
        System.out.println("Perimeter of rectangle is"+ peri);
    }
}
