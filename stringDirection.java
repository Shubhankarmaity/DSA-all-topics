public class stringDirection {
    

    public static double direction(String str){
        int x=0;
        int y=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                x+=1;
            }
            else if(str.charAt(i)=='w'){
                x-=1;
            }
            else if(str.charAt(i)=='n'){
                y+=1;
            }
            else if(str.charAt(i)=='s'){
                y-=1;
            }
            else{
                System.out.print("wrog input");
            }
        }
        double result=Math.sqrt((x*x)+ (y*y));
        return result;
    }
    public static void main(String[] args) {
        String str="wneenesennn";
        System.out.print(direction(str));
    }
}
