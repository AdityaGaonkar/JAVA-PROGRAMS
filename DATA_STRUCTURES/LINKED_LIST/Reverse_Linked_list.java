package DATA_STRUCTURES.LINKED_LIST;

public class Reverse_Linked_list {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
<<<<<<< HEAD
    public void display(Node head){
        if (head==null) return;
        System.out.print(head .val+" ");
        display(head.next);
=======
    public static void display(Node head){
        if (head==null) return;
        display(head.next);
        System.out.print(head .val+" ");

    }
    public static Node reverseNode(Node head){
        if (head.next==null)
        {
            System.out.println();
            return head;
        }
        Node newHead=reverseNode(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
>>>>>>> 6751cab18a0793395b743b664dc7facc6510fe2e
    }
    public static void main(String[] args) {
        Node a=new Node(3);
        Node b=new Node(5);
        Node c=new Node(1);
        Node d=new Node(7);
        Node e=new Node(32);
        Node f=new Node(2);
        Node g=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
<<<<<<< HEAD

=======
        display(a);
        a=reverseNode(a);
        display(a);
>>>>>>> 6751cab18a0793395b743b664dc7facc6510fe2e
    }
}
