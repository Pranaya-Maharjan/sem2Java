#! /usr/bin/env -S java --source 26
class Crle{
    double pi = 3.1428;
    double r;
    public static void main(String[] args){
        Crle c1 =new Crle();
        double r = 10.00;
        c1.calculateArea(r);
        c1.calculatePeri(r);
    }
    public void calculateArea(double r){
        this.r = r;
        double area = this.pi *(this.r*this.r);
        System.out.println("The area of circle is" + area);
    }
    public void calculatePeri(double r){
        this.r = r;
        double peri = 2 *this.pi *this.r;
        System.out.println("The perimeter of circle is" + peri);
    }
}
        
