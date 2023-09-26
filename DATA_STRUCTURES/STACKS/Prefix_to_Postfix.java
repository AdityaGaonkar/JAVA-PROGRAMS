package DATA_STRUCTURES.STACKS;

import java.util.Stack;
//while performing operations on prefix then always traverse reverse
public class Prefix_to_Postfix {
    public static void main(String[] args) {
        String str="-9/*+5346";
        Stack<String> val=new Stack<>();
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
        if(Character.isLetterOrDigit(ch)) {
            String s=""+ ch;
            val.push(ch+"");
        }else{
            String v1= val.pop();
            String v2= val.pop();
            char op=ch;
            String t=v1+v2+op;
            val.push(t);
        }
        }
        System.out.println(val.pop());
    }
}
