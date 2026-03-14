public class pair {
    
    public static int pairing(int n){

        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=pairing(n-1);
        //pair
        int fnm2=pairing(n-2);
        int pairWays=(n-1)*fnm2;

        int totalWays=fnm1+pairWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.print(pairing(3));
    }
}
