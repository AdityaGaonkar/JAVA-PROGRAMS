package Sorting_algorithms;

public class BINARY_SEARCH {
    static boolean binary_search(int[] arr,int target){
     int n= arr.length;
     int start=0,end=n-1;
     while (start<=end){
         int mid=(start+end)/2;
         if (arr[mid]==target){
             return true;
         }
         if (arr[mid]>target){
             end=mid-1;
         }else {
             start=mid+1;
         }
     }
     return false;
    }
    public static void main(String[] args) {
        int [] arr={-5,-3,-1,5,15,26,85,125};
        int target=136;
        System.out.println(binary_search(arr,target));
    }
}
