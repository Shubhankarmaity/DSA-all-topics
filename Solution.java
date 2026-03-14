// class Solution {
//     public static int repeatedNTimes(int[] nums) {

//         int n=nums.length/2;
//         int count=1;
//         // int result;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     count+=1;
//                 }
//             }
//             if(count==n){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int []nums={5,1,5,2,5,3,5,4};
//         System.out.print(repeatedNTimes(nums));
//     }
// }

// class Solution {
//     public static int sumFourDivisors(int[] nums) {
//         int count = 0;
//         int j = 1;
//         int sum1 = 0;
//         for (int i = 0; i < nums.length; i++) {
//             while (j < 10) {
//                 if (nums[i] % j == 0) {
//                     count += 1;
//                     sum1 += j;
//                 }
//                 j++;
//             }
//             sum1 += nums[i];
//         }
//         if (count >= 3) {
//             return sum1;
//         }
//         return 0;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 21, 4,7 };
//         System.out.print(sumFourDivisors(nums));
//     }
// }

// import java.util.*;
// class Solution {
//     public static int[] maxSubsequence(int[] nums, int k) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             list.add(nums[i]);
//         }
//         Collections.sort(list, Collections.reverseOrder());
//         int[] res = new int[k];
//         for (int i = 0; i < k; i++) {
//             res[i] = list.get(i);
//         }
//         return Arrays.toString(res);
//     }
//     public static void main(String[] args) {
//         int[]nums={1,2,3,3};
//         System.out.println(maxSubsequence(nums, 2));
//     }
// }

public class Solution {
    public static int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==original){
                original=2*original;
            }
            i++;
        }
        return original;
    }
    public static void main(String[] args) {
        int []nums={5,3,6,1,12};
        int original=3;
        System.out.print(findFinalValue(nums, original));
    }
}