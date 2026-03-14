import java.util.Arrays;

public class minabsDiff {
    
    public static void main(String[] args) {
        int A[]={1,2,3};
        int B[]={2,4,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans+=Math.abs(A[i]-B[i]);
        }
        System.out.println(ans);
    }
}
