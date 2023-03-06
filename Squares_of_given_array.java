import java.util.Scanner;
//Given an integer array 'a' sorted in non-decreasing order,return an array of the squares of each number sorted in non-decreasing order
public class Squares_of_given_array {


    static void printarr(int[] ans){
        for (int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }



    static int[] squared_array(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        int left=0;
        int right= arr.length-1;
        while (left<=right){
            if (Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;
            }
            else{
                ans[j++]=arr[right]*arr[right];
                right--;
            }

        }
        return ans;

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
        System.out.println("Entered elements are");
        printarr(arr);
        int[] ans=squared_array(arr);
        //sortArray(arr);
        reverse(ans);
        System.out.println("sorted array is");
        printarr(ans);
    }
}
