package Sorting_algorithms;

public class QUICK_SORT {
    static void display(int[] arr){
        for (int vals:arr){
            System.out.print(vals+ " ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static int partiton(int[] arr,int st,int end){
        int pivot=arr[st];
        int count=0;
        for (int i=st+1;i<=end;i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotindex=st+count;
        swap(arr,st,pivotindex);
        int i=st,j=end;
        while (i<pivotindex&&j>pivotindex){
            while (arr[i]<=pivot)i++;
            while (arr[j]>pivot)j--;
            if (i<pivotindex&&j>pivotindex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }


        return pivotindex;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st>=end){
            return;
        }
        int pi=partiton(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr, pi+1, end);
    }
    public static void main(String[] args) {
        int[] arr={7,8,1,2,4,6,15,13,19,14,25,20};
        System.out.println("arrays before sorting");
        display(arr);
        System.out.println("\narrays after sorting");
        quicksort(arr,0,arr.length-1);
        display(arr);

    }
}
