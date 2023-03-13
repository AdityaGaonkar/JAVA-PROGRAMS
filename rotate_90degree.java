import java.util.Scanner;

public class rotate_90degree {
    static void printarr(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void Transpose(int[][] arr,int row,int col){
        for (int i=0;i<col;i++){
            for (int j=i;j<row;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
       //printarr(arr);
    }
    static void reverse(int[] arr){
        int i=0,j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
    static void rotate(int[][] arr,int n){
        Transpose(arr,n,n);
        for (int i=0;i<n;i++){
            reverse(arr[i]);
        }
        System.out.println("array after rotating is");
        printarr(arr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows and coloumns for square matrix 1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("enter the elements");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1 is");
        printarr(arr1);
        rotate(arr1,r1);
    }
}
