class Main{
    public static void main(String[] args){
         Rectangle r = new Rectangle ();
         r.l=12;
         r.b=4;
         System.out.println("Area"+ r.area());
         System.out.println("Perimeter"+r.perimeter());
         Circle c = new Circle();
         c.r =6;
         System.out.println("Area"+c.area());
         System.out.println("Perimeter"+c.perimeter());
         Shape s = new Shape();
         s.area();
         s.perimeter();
    }
}
class Shape{
    double area(){
         System.out.println("area");
	 return 0;
    }
    double perimeter(){
         System.out.println("perimeter");
	 return 0;
    }
}
class Rectangle extends Shape{
    double l,b;
    @Override
    double area(){
       return l*b;
    }
    @Override
    double perimeter(){
       return 2*(l+b);
    }
}
class Circle extends Shape{
    double r;
    double pi = 3.1478;
    @Override
   double area(){
       return pi * r * r;
   }
   @Override
   double perimeter(){
       return 2* pi * r;
   }
}
