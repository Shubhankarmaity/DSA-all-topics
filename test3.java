public class test3 {
    // public static boolean checkInclusion(String s1, String s2) {
    //     int n=s1.length();
    //     int m=s2.length();
    //     int count=0;


    //     for(int i=0;i<m;i++){
    //         if(s2.charAt(i)==s1.charAt(0)){
    //             int j=0;
    //             while(j<n){
    //                 if(s1.charAt(j)==s2.charAt(i)){
    //                     count++;
    //                     i=i-1;
    //                     j++;
    //                 }
    //                 else{
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    //     if(count==n){
    //         return true;
    //     }
    //     return false;
    // }
    //     public static boolean checkInclusion(String s1, String s2) {
    //     int n=s1.length();
    //     int m=s2.length();
    //     int count=0;
    //     int j=0;

    //     for(int i=0;i<m;){
    //         if(s2.charAt(i)==s1.charAt(j) && j<n){
    //             count++;
    //             i=i-1;
    //             j=j+1;
    //         }
    //         else{
    //             i+=count;
    //             count=0;
    //             j=0;
    //         }
    //     }
    //     if(count==n){
    //         return true;
    //     }
    //     return false;
    // }

    public static int funA(int n){
        if(n==0){
            return 0;
        }
        return n+funB(n-1);
    }
    public static int funB(int n){
        if(n==0){
            return 0;
        }
        return n+funA(n-1);
    }
    public static void main(String[] args) {
        // String s1="ab";
        // String s2="eidbaooo";
        // System.out.println(checkInclusion(s1,s2));
        System.out.print(funA(4));
    }
}

