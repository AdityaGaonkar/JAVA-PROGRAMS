package DATA_STRUCTURES.LINKED_LIST;

public class LINKED_LIST {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void printrecursively(Node head){
        if (head==null) return;
        System.out.print(head.data+ " ");
        printrecursively(head.next);
    }
    public static int lengthoflist(Node head){
        int length=0;
        Node temp=head;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }
    public static  class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(1);
        Node e=new Node(3);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;

//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(c.next.data);
//        System.out.println(d.next.data);
//       System.out.println(e.next.data);
      //  print(a);
        System.out.println();
        printrecursively(a);
        System.out.println();
        printrecursively(a);
        System.out.println();
        int num= lengthoflist(a);
        System.out.println("length of list is "+ num);




    }
}
