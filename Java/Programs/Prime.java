public class Prime{
    public static void main(String[] args){
        try{
            int num = Integer.parseInt(args[0]);
            if(num <=1){
                System.out.println("The number is not prime number");
                return;
            }
            boolean isPrime = true;
            for(int i =2; i <= num; i ++){
                if(num%i==0 && num!=i){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("please provide numeric value");
        }
    }
}
