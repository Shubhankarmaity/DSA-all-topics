class leetcode560{
    public static int subarraySum(int[] nums, int k) {
        int i=0;
        int sum=0;
        int count=0;
        while(i<nums.length){
            sum=nums[i];
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                    i=i+1;
                    sum=0;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []num={1,2,3};
        System.out.println(subarraySum(num,2));
    }
}
