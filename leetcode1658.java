class leetcode1658{
    public static int minOperations(int[] nums, int x) {
        int i=0,j=nums.length-1;
        int count=0;

        while(i<j){
            if(x>0){
                if(nums[i]>nums[j] && x > nums[i]){
                    x-=nums[i];
                    count++;
                    i++;
                }
                else if(x > nums[j]){
                    x-=nums[j];
                    count++;
                    j--;
                }
            }
            if(x>0){
                if(nums[j]>nums[i] && x > nums[j]){
                    x-=nums[j];
                    count++;
                    j--;
                }
                else if(x > nums[i]){
                    x-=nums[i];
                    count++;
                    i++;
                }
            }
            if(x==0){
                return count;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int []arr={3,2,20,1,1,3};
        System.out.println(minOperations(arr,10));
    }
}