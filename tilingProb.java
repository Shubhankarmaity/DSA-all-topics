//AMAZON

public class tilingProb {
    
    public static int tilingProblem(int n){//n for length

        if(n==0 || n==1){
            return 1;
        }
        //for vertical 
        int fnm1=tilingProblem(n-1);
        //for horizontal
        int fnm2=tilingProblem(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.print(tilingProblem(4));
    }
}
