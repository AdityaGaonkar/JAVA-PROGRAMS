package DATA_STRUCTURES.STACKS;

import java.util.Stack;

public class Infix_to_postfix {
    public static int precedence(char ch){
        switch (ch){
            case '+':
            case '-': return 1;
            case '/':
            case '*': return 2;
            case '^':return 3;
            default:return -1;
        }
    }
    public static void main(String[] args) {
        String infix="(a-(b^c))+(d)";
        System.out.println("infix is"+ infix);
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(Character.isLetterOrDigit(ch)){//0 to 9
                String s=""+ ch;
                val.push(s);
            }else if(op.isEmpty() ||ch=='('||op.peek()=='('){
                op.push(ch);
            }else if(ch==')'){
                while(op.peek()!='('){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                }
                if (!op.isEmpty() && op.peek() == '(') {
                    op.pop(); // Pop the opening parenthesis
                }
                //op.pop();
            }
            else{
                while(!op.isEmpty()&&precedence(ch)<=precedence(op.peek())){
                    String v2=val.pop();
                    String v1=val.pop();
                    char o=op.pop();
                    String t=v1+v2+o;
                    val.push(t);
                    //op.push(ch);
                }
                op.push(ch);
            }
        }
        while(val.size()>1){
            String v2=val.pop();
            String v1=val.pop();
            char o=op.pop();
            String t=v1+v2+o;
            val.push(t);
        }
        String postfix=val.pop();
        System.out.println("postfix is " +postfix);
    }
}
