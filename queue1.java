public class queue1 {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        // add data
        public static void addLast(int data) {
            if (isFull()) {
                System.out.print("queue is full");
                return;
            }
            //add 1st element
            if(front==-1){
                front=0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        // remove data
        public static int remove() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            int result=arr[front];
            
            //remove last element
            if(front==rear){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.remove();
        q.addLast(4);
        q.remove();
        q.addLast(5);

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.remove();
        }

    }
}