public class LLPractice {
    public static class Node {
    
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //Add last
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    //add middle
    public void addMid(int data,int idx){
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx){
            i++;
            temp=temp.next;
        }
        Node post=temp.next;
        temp.next=newNode;
        newNode.next=post;
    }

    //print LL
    public void PrintLL(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LLPractice ll=new LLPractice();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        // ll.PrintLL();
        ll.addLast(2);
        ll.addLast(3);
        // ll.PrintLL();
        ll.addMid(0, 2);
        ll.PrintLL();
        System.out.println(ll.size);
    }
}
