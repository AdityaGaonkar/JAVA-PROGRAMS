import java.util.Scanner;

//Check if we can partition the array into two subarrays with equal sum.More formally, check that the prefix sum of a part of the array is equal to suffix sum of rest of the array
public class prefix_sum_2 {
    static boolean equalSumPartition(int[] arr) {
        int totalsum = 0;
        int prefsum=0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+=arr[i];
        }
        for (int i=0;i< arr.length;i++){
            prefsum+=arr[i];
            int suffixsum=totalsum-prefsum;
            if (suffixsum==prefsum){
                return true;
            }
        }
        return false;
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
        System.out.println("Equal partition possible : "+equalSumPartition(arr));

    }
}
