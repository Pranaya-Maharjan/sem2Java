public class Greatest{
    public static void main(String[] args){
        if(args.length !=3){
            System.out.println("Please enter three numeric value");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int num1= Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        if (num > num1 && num >num2){
            System.out.println("The greatest number is"+ num);
        }
        else if(num1>num && num1 >num2){
            System.out.println("The greatest number is"+ num1);
        }
        else{
            System.out.println("The greatest number is"+ num2);
        }
    }
}
