package DATA_STRUCTURES.STACKS;

import java.util.Scanner;
import java.util.Stack;

public class Insert_At_any_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(6);
        st.push(1);
        st.push(14);
        st.push(15);
        System.out.println(st);
        System.out.println("enter the index to be inserted");
        int index=sc.nextInt();
        System.out.println("enter the element to be inserted ");
        int ele=sc.nextInt();
        Stack<Integer> temp=new Stack<>();
        while(st.size()>index){
            temp.push(st.pop());
        }
        st.push(ele);
        //System.out.println(st);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);

    }
}
