import java.util.Scanner;

public class rotate_k_times {
    static int[] rotate(int[] arr,int k){
        int n= arr.length;
        int j=0;
        k=k%n;
        int[] ans=new int[n];
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
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
        System.out.println("entered elements are");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter the value of k : That is number of times the array need to be rotated");
        int k=sc.nextInt();
        int[] ans1=rotate(arr,k);
        System.out.println("The rotated array is ");
        for (int i=0;i< ans1.length;i++){
            System.out.println(ans1[i]);
        }
    }
}
