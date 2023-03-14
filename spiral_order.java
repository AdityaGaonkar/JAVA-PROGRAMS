import java.util.Scanner;

public class spiral_order {
    static void printarr(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void spiralOrder(int[][] arr1,int row,int col){
        int toprow=0,bottomrow=row-1,rightcol=col-1,leftcol=0;
        int totalelements=0;
        while (totalelements<row*col){
            //print top row that is from right col to left col
            for (int j=leftcol;j<=rightcol&&totalelements<row*col;j++){
                System.out.print(arr1[toprow][j]+ " ");
                totalelements++;
            }
            toprow++;
            //print right col from top to bottom
            for (int i=toprow;i<=bottomrow&&totalelements<row*col;i++){
                System.out.print(arr1[i][rightcol]+ " ");
                totalelements++;
            }
            rightcol--;
            //print bottom row
            for (int j=rightcol;j>=leftcol&&totalelements<row*col;j--){
                System.out.print(arr1[bottomrow][j]+ " ");
                totalelements++;
            }
            bottomrow--;
            //print left coloumn
            for (int i=bottomrow;i>=toprow&&totalelements<row*col;i--){
                System.out.print(arr1[i][leftcol]+ " ");
                totalelements++;
            }
            leftcol++;

        }
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
        System.out.println("spiral order is ");
        spiralOrder(arr1,r1,c1);
    }
}
