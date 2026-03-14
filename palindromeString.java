public class palindromeString {
    
    public static boolean palindrome(String str){
        int n= str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                System.out.print("not a palindrome");
                return false;
            }
        }
        System.out.print("palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        palindrome(str);
    }
}
