package DATA_STRUCTURES.LINKED_LIST;

public class Implementation_of_linked_list {
    public static  class Node{
        int data;//value
        Node next;//address of next node
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void insertAtend(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;

            }else {
                tail.next = temp;
            }
            tail=temp;
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            int count=0;
            Node temp=head;
            while (temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAthead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAtPos(int pos,int val){
            Node t=new Node(val);
            Node temp=head;

            if (pos==size()){
                insertAtend(val);
                return;
            } else if (pos==0) {
                insertAthead(val);
                return;
            }
            for (int i=1;i<=pos-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int getAt(int pos){
            Node temp=head;
            if (pos<0||pos>size()){
                System.out.println("wrong index");
                return -1;
            }
            for (int i=1;i<=pos;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int pos){
            Node temp=head;
            if (pos==0){
                head=head.next;
                return;
            }
            for (int i=1;i<=pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }

    }
    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtend(4);
        ll.insertAtend(5);
       // ll.display();
        System.out.println();
        //System.out.println("The size of the list is "+ ll.size());
        ll.insertAtend(12);
        //System.out.println(ll.size());
        ll.insertAthead(6);
        ll.insertAthead(8);
        ll.insertAtPos(2,25);
        ll.insertAtPos(6,25);
        ll.display();
        System.out.println();
        System.out.println(ll.getAt(6 ));
        ll.deleteAt(2);
        ll.deleteAt(3);
        ll.display();
        System.out.println( );

        System.out.println("The size of the list is "+ ll.size());
    }
}
