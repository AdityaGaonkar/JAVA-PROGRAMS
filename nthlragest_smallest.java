import java.util.Scanner;

public class nthlragest_smallest {
    static int[] sortedarr(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;

    }
    static int nthlargest(int[] arr,int num){
        sortedarr(arr);
        return arr[arr.length-num];
    }
    static int nthsmallest(int[] arr,int num2){
        sortedarr(arr);
        return arr[num2-1];
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
        sortedarr(arr);
        System.out.println("sorted array is");
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the nth largest you want to see");
        int num=sc.nextInt();
        System.out.println(num+"th largest is "+nthlargest(arr,num));
        System.out.println("enter the nth smallest  you want to see");
        int num2 =sc.nextInt();
        System.out.println(num2 +"th smallest is "+nthsmallest(arr, num2));

    }
}
