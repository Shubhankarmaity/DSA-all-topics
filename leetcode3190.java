class leetcode3190 {
    public static int minimumOperations(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++){
            // int n=nums[i]%3;
            while(nums[i]%3!=0){
                if(nums[i]%3==2){
                    nums[i]=nums[i]+1;
                    temp+=1;
                }
                else if(nums[i]%3==1){
                    nums[i]=nums[i]-1;
                    temp+=1;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        System.out.println(minimumOperations(nums));
    }
}