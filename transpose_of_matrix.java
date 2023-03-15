import java.util.Scanner;

public class transpose_of_matrix {
    static void printarr(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int[][] Transpose(int[][] arr,int row,int col){
        int[][] transpose=new int[col][row];
        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows and coloumns for square matrix 1 ");
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
        printarr(arr1);
        System.out.println("transpose matrix is");
        int[][] ans=Transpose(arr1,r1,c1);
        printarr(ans);

    }
}
