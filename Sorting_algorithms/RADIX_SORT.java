package Sorting_algorithms;

public class RADIX_SORT {
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
    static void stableCountSort(int[] arr,int place) {
        int max = findmax(arr);
        int[] count = new int[10];
        //make frequency array, arr[i]=105 freq[5]++ not frequency[105]++, for place =10you have to do frequency[0]++
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }
        int n = arr.length;
        int[] output = new int[n];
        //make prefix sum of count array
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            int index = count[(arr[i]/place)%10] - 1;
            output[index] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void radixsort(int[] arr){
        int max=findmax(arr);
        //apply counting sort to sort elements based on place value
        for (int place=1;max/place>0;place*=10){
            stableCountSort(arr,place);
        }
    }
    public static void main(String[] args) {
        int[] arr={43,453,251,2,48,420};
        System.out.println("before sorting");
        display(arr);
        System.out.println("\nafter sorting");
        radixsort(arr);
        display(arr);
        }
}
