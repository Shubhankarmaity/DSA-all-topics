import java.util.HashMap;

public class largestSubarr {
    public static int largestSub(int arr[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum)){
                len=Math.max(len, j-hm.get(sum));
            }
            else{
                hm.put(sum, j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        System.out.print("max subarr length: "+largestSub(arr));
    }
}
