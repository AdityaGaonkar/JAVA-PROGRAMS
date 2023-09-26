package DATA_STRUCTURES.Queues;

public class Queue_using_Linked_list {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class QueueLL{
            Node head=null;
            Node tail=null;
             int size=0;
            public void add(int x){
                Node temp=new Node(x);
                if (size==0){
                    head=tail=temp;
                }else{
                    tail.next=temp;
                    tail=temp;
                }
                size++;
            }
            public int peek(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                return head.val;
            }
            public int remove(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                    int x=head.val;
                    head=head.next;
                    size--;
                    return x;
            }
            public void display(){
                Node temp=head;
                if (size==0){
                    System.out.println("queue is empty");
                    return ;
                }
                while (temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
        }
     public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
    }
}
