package Sorting_algorithms;

public class COUNT_SORT{
    static void display(int[] arr){
        for (int vals:arr){
            System.out.print(vals+" ");
        }
    }
    static int findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countsort(int[] arr){
        int max=findmax(arr);
        int[] count=new int[max+1];
        for (int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i< count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={4,1,9,5,6,7,2,15,16,14,11};
        System.out.println("before sorting");
        display(arr);
        countsort(arr);
        System.out.println("\nafter sorting");
        display(arr);
    }
}
