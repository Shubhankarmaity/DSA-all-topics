import java.util.ArrayList;

public class Heap2 {
    
    static class Heap {
    
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            //add element at last idx
            arr.add(data);
            //calculate the child idx
            int x=arr.size()-1;
            //calculate the parent idx
            int par=(x-1)/2;

            while (arr.get(x)<arr.get(par)) {
                int temp=arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        //heapify
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;

            if(left<arr.size()&&arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size()&&arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                //swap
                int temp=arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        public int remove(){
            int n=arr.size();
            int data=arr.get(0);
            //step 1 to swap
            int temp=arr.get(0);
            arr.set(0, arr.get(n-1));
            arr.set(n-1, temp);
            //step 2 delete last element
            arr.remove(n-1);
            //step 3 fix heap using heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
