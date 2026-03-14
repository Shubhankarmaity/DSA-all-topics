public class SubArraySum3 {
    
    public static void SubArrSum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            if (maxSum<currSum) {
                maxSum=currSum;
            }
        }
        System.out.print("max sum is: "+maxSum);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        SubArrSum(arr);
    }
}
