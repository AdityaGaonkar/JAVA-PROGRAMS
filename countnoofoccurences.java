import java.util.Scanner;
public class countnoofoccurences {
    static int countOccurences(int[] arr,int ele){
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (ele==arr[i]){
             count=i;
            }
        }
        return count+1;

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
        System.out.println("enter the ele to be searched");
        int ele= sc.nextInt();
        //countOccurences(arr,ele);
        System.out.println("element found "+ countOccurences(arr,ele)+" times");
    }
}