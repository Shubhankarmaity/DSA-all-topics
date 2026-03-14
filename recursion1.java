public class recursion1{

    public static void printacc(int x){
        if(x==10){
            System.out.print(x);
            return;
        }
        System.out.print(x+" ");
        printacc(x+1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fmn1=fact(n-1);
        int fn=n*fmn1;
        return fn;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int s1=sum(n-1);
        int result=n+s1;
        return result;
    }
    public static void main(String[] args) {
        int n=8;
        // printacc(x);
        System.out.print(sum(n));
        
    }
}