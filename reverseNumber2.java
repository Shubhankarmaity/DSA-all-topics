import java.util.Scanner;
public class reverseNumber2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int reversenumber=0;
        while (num>0) {
            int lastDigit=num%10;
            reversenumber=(reversenumber*10)+lastDigit;
            // System.out.println(reversenumber);
            num=num/10;
        }
        System.out.println(reversenumber);
    }
}
