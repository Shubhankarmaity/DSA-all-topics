public class LinkedList1 {
    
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //step-1=> create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step2=> newNode next = head
        newNode.next=head;
        //step3=>head=data
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //Print all LL
    public void printLL(){
        if(head==null){
            System.out.print("LLis empty");
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //Add in index
    public void addidx(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp-->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //Remove First
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    //Remove Last
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=head.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //Search for a key
    public int ittrSearch(int key){
        Node temp=head;
        int idx=0;
        while (temp != null) {
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }
    //using recursive search
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedList1 ll=new LinkedList1();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.addidx(5, 2);
        ll.printLL();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printLL();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printLL();
        System.out.println(ll.size);
        ll.addFirst(2);
        ll.addFirst(6);
        ll.addFirst(9);
        ll.printLL();
        System.out.println("index is: "+ll.ittrSearch(2));
        System.out.println("using rec index is:"+ll.recSearch(1));
    }
}
