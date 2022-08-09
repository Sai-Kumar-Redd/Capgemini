import java.util.*;
public class SumArray {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0, avg = 0;
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++) {
            sum += arr[i];
            avg = sum / n;
        }
        System.out.println("Sum of the elements"+sum);
        System.out.println("Average of elements" + avg);

    }
}
