import java.util.Scanner;

public class Sort_zeros_ones {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    /*
    static void SortZerosAndOnes(int[] arr){
        int n= arr.length;
        int count=0;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                count++;
            }
        }
        for (int i=0;i<n;i++){
            if (i<count) {
                arr[i] = 0;
            }
            else {
                arr[i]=1;
            }
        }
        printarr(arr);
    }

     */
    /*More effcient approach that is two pointer approach

     */
    static void SortZerosAndOnes(int[] arr){
        int left=0;
        int right= arr.length-1;
        while (left<right){
            if (arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        printarr(arr);
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
        System.out.println("entered elements are");
        printarr(arr);
        System.out.println("after sorting");
        SortZerosAndOnes(arr);

    }
}
