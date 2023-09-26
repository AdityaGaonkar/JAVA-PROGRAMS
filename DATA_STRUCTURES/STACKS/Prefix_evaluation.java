package DATA_STRUCTURES.STACKS;

import java.util.Stack;

public class Prefix_evaluation {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if (ascii>=48&&ascii<=57){
                val.push(ascii-48);
            }else{//because here we are traversing backside so 1st value popped is v1
                int v1= val.pop();
                int v2= val.pop();
                if (ch=='+')val.push(v1+v2);
                if (ch=='-')val.push(v1-v2);
                if (ch=='*')val.push(v1*v2);
                if (ch=='/')val.push(v1/v2);
            }
        }
        System.out.println(val.pop());
    }
}
