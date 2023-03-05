import java.util.Scanner;

public class reverse_an_array {
    static int[] reersearray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int j=0;
        for (int i= arr.length-1;i>=0;i--){
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
        System.out.println("reversed array is");
        int[] ans=reersearray(arr);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}
