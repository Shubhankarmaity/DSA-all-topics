public class PrintSubArray {
    public static void subArr(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("sum is:"+sum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subArr(arr);
        
    }
}
