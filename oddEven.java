public class oddEven{
    public static void oddeven(int n){
        int lastDigi=n%10;
        if(lastDigi==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
    public static void main(String[] args) {
        int n=011;
        oddeven(n);
    }
}