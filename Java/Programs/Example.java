#! /usr/bin/env -S java --source 26
public class Example2{
    int a = 10;
    void changeValue(int a){
        a= a+10;
    }
    public static void main(String[] args){
        Example2 obj = new Example2();
        System.out.println("Before:"+obj.a);
        obj.changeValue(obj.a);
        System.out.println("After:"+obj.a);
    }
}
