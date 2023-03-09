import java.util.Scanner;

public class suffix_sum {
    static int[] suffixSum(int[] arr){
        int n= arr.length;
        int[] suffixsum=new int[n];

        suffixsum[n-1]=arr[n-1];
        for (int i=n-2;i>=0;i--){
            suffixsum[i]=suffixsum[i+1]+arr[i];
        }
        return suffixsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements of the array");
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] ans=suffixSum(arr);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
