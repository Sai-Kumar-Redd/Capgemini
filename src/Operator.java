import java.util.Scanner;
class Operator {
    public static void main(String[]args){

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first Number=");
        int num1 =sc.nextInt();
        System.out.println("Enter the Second Number");
        int num2 =sc.nextInt();
        int sum =num1+num2;
        System.out.println("your number sum:"+sum);
        int sub=num1-num2;
        System.out.println("Your number subtraction:"+sub);
        int mul=num1*num2;
        System.out.println("Your number multiplication:"+mul);
        int div=num1/num2;
        System.out.println("Your number Division :"+div);

    }
}
