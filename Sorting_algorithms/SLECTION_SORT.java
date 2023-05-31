package Sorting_algorithms;

public class SLECTION_SORT {
    static void selectionsort(int[] arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={6,58,4,9,5,2,1,156,250};
        selectionsort(arr);
        for(int i:arr){
            System.out.println(i+ " ");
        }
    }
}
