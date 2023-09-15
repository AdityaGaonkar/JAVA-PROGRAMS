package DATA_STRUCTURES.STACKS;

import java.util.Scanner;
import java.util.Stack;

public class Display_stack {
    public static void displayrecursively(Stack<Integer> st){
        if (st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayrecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(6);
        st.push(1);
        st.push(14);
        st.push(15);
//        int n=st.size();
//        int arr[]=new int[n];
//        for (int i=n-1;i>=0;i--){
//            arr[i]=st.pop();
//        }
//        for (int i=0;i<n;i++){
//            int x=arr[i];
//            System.out.print(x+" ");
//            st.push(x);
//        }
        displayrecursively(st);

    }
}
