import java.util.*;
public class monotonicStack{
    public static int minOperations(int[] nums) {
        int count=0;
        Stack<Integer> s=new Stack<>();
        // s.push(0);
        for(int i=0;i<nums.length;i++){
            while(!s.isEmpty()&&s.peek()>nums[i]){
                s.pop();
            }
            if(nums[i]==0){
                continue;
            }
            else if(s.isEmpty()||s.peek()<nums[i]){
                s.push(nums[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[]={1,2,1,2,1,2};
        System.out.print(minOperations(nums));
    }
}
