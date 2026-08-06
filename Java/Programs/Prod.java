#! /usr/bin/env -S java --source 26
public class Prod{
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("Please provide two numbers:");
            return;
         }
         try{
             int num1 = Integer.parseInt(args[0]);
             int num2 = Integer.parseInt(args[1]);
             System.out.println("Result:" + (num1 * num2));
         } catch (NumberFormatException e){
               System.out.println("Error:Please provide valid integers.");
         }
     }
}
