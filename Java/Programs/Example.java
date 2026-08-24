public class Example{
    int a = 10;
    void changeValue(int a){
        a= a+10;
    }
    public static void main(String[] args){
        Example obj = new Example();
        System.out.println("Before:"+obj.a);
        obj.changeValue(obj.a);
        System.out.println("After:"+obj.a);
    }
}
