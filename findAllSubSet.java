import java.util.*;
public class findAllSubSet{

    public static void findSubSet(int []nums, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ans,int idx){
        if(idx==nums.length){
            result.add(ans);
            return ;
        }
        ans.add(nums[idx]);
        findSubSet(nums, result, ans, idx+1);
        ans.remove(ans.size()-1);
        findSubSet(nums, result, ans, idx+1);
    }

    public static ArrayList<ArrayList<Integer>> findPermutation(int []nums){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        findSubSet(nums,result,ans,0);
        return result;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(findPermutation(nums));
    }
    
}