package DATA_STRUCTURES.LINKED_LIST;

public class ProblemsOfLinkedlist {
    public static  class Node{
        int data;//value
        Node next;//address of next node
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node deleteNthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        if (fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(1);
        Node e=new Node(3);
        Node f=new Node(2);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        display(a);
        deleteNthNodeFromEnd(a,1);
        display(a);

    }
}
