import java.util.Arrays;

public class climbStair {
    public static int climb(int n){
        if(n==0||n==1){
            return 1;
        }
        if(n<0){
            return 0;
        }
        return climb(n-1)+climb(n-2);
    }
    //Memoization
    public static int climbMemo(int n,int []dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(n-1)+climb(n-2);
        return dp[n];
    }
    //Tabulation
    public static int climTabo(int n){
        int []dp=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
        int []dp=new int[n+1];
        Arrays.fill(dp, -1);//to fill every where -1 in the array
        System.out.println(climb(n));
        System.out.println(climbMemo(n, dp));
        System.out.println(climTabo(n));
    }
}
