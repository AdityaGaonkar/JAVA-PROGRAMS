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
    /*
    its unstable algorithm

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
     */
    static void stableCountSort(int[] arr){
        int max=findmax(arr);
        int[] count=new int[max+1];
        for (int i=0;i< arr.length;i++){
            count[arr[i]]++;
        }
        int n= arr.length;
        int[] output=new int[n];
        //make prefix sum of count array
        for (int i=1;i< count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i=n-1;i>=0;i--){
            int index=count[arr[i]]-1;
            output[index]=arr[i];
            count[arr[i]]--;
        }
        for (int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    public static void main(String[] args) {
        int[] arr={4,1,9,5,6,7,2,15,16,14,11};
        System.out.println("before sorting");
        display(arr);
        //countsort(arr);
        stableCountSort(arr);
        System.out.println("\nafter sorting");
        display(arr);
    }
}
