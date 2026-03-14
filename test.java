// class test {
    // public static String largestGoodInteger(String num) {
    //     int n=num.length();
    //     int count=0;
    //     StringBuilder sb=new StringBuilder(" ");

    //     for(int i=0;i<n-2;i++){
    //         if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
    //             sb.append(num.charAt(i));
    //             sb.append(num.charAt(i+1));
    //             sb.append(num.charAt(i+2));
    //         }
    //     }
    //     String resultString = sb.toString();
    //     return resultString;
    // }
    // public static int maxReturn(String resultString){
    //     for(int i=0;i<resultString.length()-1;i++){
    //         char first=resultString.charAt(i);
    //         char secend=resultString.charAt(i+1);
    //         if(first>secend){
    //             char temp=first;
    //             char first=secend;
    //             char secend=temp;

    //         }
    //     }
    // }

    import java.util.*;
class test {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    int min=0;
    public test() {
        
    }
    
    public void push(int val) {
        s.push(val);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin(Stack<Integer>s1,Stack<Integer>s) {
        while(!s.isEmpty()){
            if(min<s.peek()){
                s1.push(s.pop());
            }else{
                min=s.peek();
                s1.push(s.pop());
            }
            while(s1.isEmpty()){
                s.push(s1.pop());
            }
        }
        return min;
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
    public static void main(String[] args) {
        // String num="12444555";
        // System.out.println(largestGoodInteger(num));
    }
}