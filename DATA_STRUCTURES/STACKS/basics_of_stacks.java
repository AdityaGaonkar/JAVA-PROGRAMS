package DATA_STRUCTURES.STACKS;

import java.util.Stack;

public class basics_of_stacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(6);
        st.push(1);
        st.push(14);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.pop());

    }
}
