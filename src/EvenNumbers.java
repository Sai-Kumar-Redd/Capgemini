import java.util.Scanner;
 class EvenNumbers {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int i=100;
        System.out.println("Even Number");
        for(i=0;i<=100;i++)
            if(i%2==0)
                System.out.println(i+" ");

    }
}
