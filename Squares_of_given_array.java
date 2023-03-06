import java.util.Scanner;
//Given an integer array 'a' sorted in non-decreasing order,return an array of the squares of each number sorted in non-decreasing order
public class Squares_of_given_array {
    static void printarr(int[] arr){
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    static void squared_array(int[] arr){
        int n= arr.length;
        int[] ans=new int[n];
        int j=0;
        for (int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];
        }
        System.out.println("the squared array is");
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
        printarr(arr);
        squared_array(arr);
    }
}
