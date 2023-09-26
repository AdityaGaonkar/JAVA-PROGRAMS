package DATA_STRUCTURES.Queues;

public class Circular_queue_using_array {
    public static class CqA{
        int front=1;
        int rear=-1;
        int size=0;
        int[] arr=new int[100];
        public void add(int val) throws Exception {
            if (size==arr.length){
//                System.out.println("queue is full");
//                return;
                throw new Exception("queue is full");
            }else if(size==0){
                front=rear=0;
                arr[0]=val;
            }else if(rear< arr.length-1){
                arr[++rear]=val;
            }
            else if (rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception {
            if (size==0){
                throw new Exception("queue is empty");
            }
             else{
                 int val=arr[front];
                 if (front== arr.length-1) {
                     front=0;
                 }else{
                     front++;
                 }
                size--;
                 return val;
            }

        }
        public int peek() throws Exception{
           if (size==0){
               throw new Exception("queue is empty");
           }else {
               return arr[front];
           }
        }
        public void display(){
            if (size==0){
                System.out.println("empty queue");
                return;
            }
            else {
                if (front<=rear){
                    for (int i=front;i<=rear;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
                if (rear<front){
                    for (int i=front;i<= arr.length-1;i++){
                        System.out.print(arr[i]+" ");
                    }
                    for (int i=0;i<=rear;i++){
                        System.out.print(arr[i]+" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        CqA q=new CqA();
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
