import java.util.Scanner;

public class target_sum {
    static int pairsum(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target) {
                    ans++;
                }
            }
        }
        return ans;
    }
    static int tripletsum(int[] arr,int target){
        int n=arr.length;
        int ans=0;
        for (int i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
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
        System.out.println("entered elements are");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("enter the target sum for pairs ");
        int target=sc.nextInt();
        System.out.println("no of pairs matching target sum for pairs is "+pairsum(arr,target));
        System.out.println("enter the target sum for triplets ");
        int target2 =sc.nextInt();
        System.out.println("no of pairs matching target sum for triplets is "+tripletsum(arr,target2));
    }
}
