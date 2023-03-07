import java.util.Scanner;

public class PrefixSum {
    static void printarr(int[] ans){
        for (int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
    static int[] PrefixSum(int[] arr){

        int[] pref=new int[arr.length];
        pref[0]=arr[0];
        for (int i=1;i< arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        //printarr(arr);
        return arr;
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
        printarr(arr);
        int[] pref=PrefixSum(arr);
        System.out.println("prefix sum array is");
        printarr(arr);
    }
}
