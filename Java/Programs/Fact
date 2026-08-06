#! /usr/bin/env -S java --source 26
public class Fact{
    public static void main(String[] args){
        try{
            int num = Integer.parseInt(args[0]);
            int factorial = 1;
            for(int i =1; i<=num; i++){
               factorial *=i;
            }
            System.out.println("The factorial of"+num+"is"+factorial);
         }
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println("please provide numeric value");
         }
    }
}
