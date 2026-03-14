public class PairSum {
    
    // public static boolean pairSum(int []pair,int target){
    //     int lp=0;
    //     int rp=pair.length-1;
    //     while(lp<rp){
    //         if(pair[lp]+pair[rp]==target){
    //             return true;
    //         }
    //         else if(pair[lp]+pair[rp]<target){
    //             lp++;
    //         }
    //         else{
    //             rp--;
    //         }
    //     }
    //     return false;
    // }

    //for Sorted & Rotated array
    public static boolean pairSum(int[] pair,int target){
        int n=pair.length;
        int lp=0;
        int rp=0;
        for(int i=0;i<n-1;i++){
            if(pair[i]>pair[i+1]){
                lp=i+1;
                rp=i;
            }
        }

        while (lp!=rp) {
            if(pair[lp]+pair[rp]==target){
                return true;
            }
            else if(pair[lp]+pair[rp]<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // int []pair={1,2,3,4,5,6};
        // int target=4;
        // System.out.print(pairSum(pair, target));
        int []pair={11,15,6,8,9,10};
        int target=189;
        System.out.print(pairSum(pair, target));
    }
}
