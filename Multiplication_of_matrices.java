import java.util.Scanner;

public class Multiplication_of_matrices {
    static void printArr(int[][] arr,int row,int col){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multArray(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if (r2!=c1){
            System.out.println("multiplication not possible");
            return;
        }
        int[][] mult=new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                for (int k=0;k<c1;k++){
                    mult[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("multipled array is");
        printArr(mult,r1,c2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and coloumns of matrix 1 ");
        int r1= sc.nextInt();
        int c1= sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("enter the elements");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 1 is");
        printArr(arr1,r1,c1);
        System.out.println("enter no of rows and coloumns of matrix 2 ");
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("enter the elements");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("matrix 2 is");
        printArr(arr2,r2,c2);
        multArray(arr1,r1,c1,arr2,r2,c2);
    }
}
