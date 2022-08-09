import java.util.Scanner;
public class Bingo {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
                System.out.println("Enter a number in range of 1 to 50");
        int num=sc.nextInt();
        if(num<0||num>50) {
            System.out.println("Number is not in the specified range");
        }
        int arr[]={10,35,43,5,8};
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println("Bingo");
            }
        }
    }
}
