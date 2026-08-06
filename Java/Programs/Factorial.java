#! /usr/bin/env -S java --source 26
public class Factorial{
    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println("Factorial of 5 is:" + factorial(5));
    }
}
