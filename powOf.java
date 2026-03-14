public class powOf {
    
    public static boolean powof(int num){
        
        for(int i=1;i<num;i++){
            double power=Math.pow(2, i);
            if(power==num){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num=6;
        System.out.println(powof(num));
    }
}
