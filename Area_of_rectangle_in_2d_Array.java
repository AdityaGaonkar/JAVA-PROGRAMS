import java.util.Scanner;

public class Area_of_rectangle_in_2d_Array {
    static void printArr(int[][] arr,int row,int col){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Prefixsum(int[][] arr){
        int r= arr.length;
        int c=arr[0].length;
        int sum=0;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static int rectanglesum(int[][] arr,int l1,int r1,int l2,int r2){
        Prefixsum(arr);
        int sum=0;
        for (int i=l1;i<=l2;i++){
            if (r1>1)
            sum+=arr[i][r2]-arr[i][r1-1];
            else
                sum+=arr[i][r2];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and coloumns of matrix 1 ");
        int rr1= sc.nextInt();
        int c1= sc.nextInt();
        int[][] arr1=new int[rr1][c1];
        System.out.println("enter the elements");
        for (int i=0;i<rr1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 1 is");
        printArr(arr1,rr1,c1);
        System.out.println("enter the coordinates");
        int l1= sc.nextInt();
        int r1= sc.nextInt();
        int l2= sc.nextInt();
        int r2= sc.nextInt();
        int sum=rectanglesum(arr1,l1,r1,l2,r2);
        System.out.println("sum of the rectangle is "+sum);

    }
}
